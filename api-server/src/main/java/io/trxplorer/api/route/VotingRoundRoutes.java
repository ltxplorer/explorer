package io.trxplorer.api.route;

import java.util.Optional;

import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import io.trxplorer.service.common.VoteService;
import io.trxplorer.service.dto.common.ListModel;
import io.trxplorer.service.dto.vote.VoteListCriteria;
import io.trxplorer.service.dto.vote.VoteLiveListCriteria;
import io.trxplorer.service.dto.vote.VoteLiveModel;
import io.trxplorer.service.dto.vote.VoteModel;
import io.trxplorer.service.dto.vote.VotingRoundStatsListCriteria;
import io.trxplorer.service.dto.vote.VotingRoundStatsModel;

@Singleton
public class VotingRoundRoutes {

	private VoteService voteService;

	@Inject
	public VotingRoundRoutes(VoteService voteService) {
		this.voteService = voteService;
	}

	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_LIVE)
	public ListModel<VoteLiveModel, VoteLiveListCriteria> listLiveVotes(Optional<Integer> page) throws Throwable {
		
		VoteLiveListCriteria criteria = new VoteLiveListCriteria();
		
		criteria.setLimit(50);
		criteria.setPage(page.orElse(1));
		
		return this.voteService.listLiveVotesStats(criteria);		
	}	

	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_LIVE_TOTAL)
	public long listLiveVotesTotal(Optional<Integer> page) throws Throwable {
		
		
		return this.voteService.getLiveTotalVotes();		
	}	

	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_ROUND_STATS)
	public ListModel<VotingRoundStatsModel, VotingRoundStatsListCriteria> listRoundStats(Integer maxRound,Optional<Integer> page) throws Throwable {
		
		VotingRoundStatsListCriteria criteria = new VotingRoundStatsListCriteria();
		
		criteria.setLimit(1);//FIXME not considered just to prevent NPE
		criteria.setPage(page.orElse(1));
		criteria.setMaxRound(maxRound);
		
		return this.voteService.listRoundStats(criteria);		
	}
	
	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_ROUND)
	public ListModel<VotingRoundStatsModel, VotingRoundStatsListCriteria> listRounds(Integer round,Optional<Integer> page) throws Throwable {
		
		VotingRoundStatsListCriteria criteria = new VotingRoundStatsListCriteria();
		
		criteria.setLimit(50);
		criteria.setPage(page.orElse(1));
		criteria.setRound(round);
		
		return this.voteService.listRoundStats(criteria);		
	}
	
	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_LIVE_VOTES)
	public ListModel<VoteModel, VoteListCriteria> listLiveVotes(String address,Optional<Integer> page) throws Throwable {
		
		VoteListCriteria criteria = new VoteListCriteria();
		
		criteria.setLimit(50);
		criteria.setPage(page.orElse(1));
		criteria.setToAddress(address);;
		
		return this.voteService.listLiveVotes(criteria);		
	}	
	
	@GET
	@Path(ApiAppRoutePaths.V1.VOTE_ROUND_VOTES)
	public ListModel<VoteModel, VoteListCriteria> listVotes(Integer round,String address,Optional<Integer> page) throws Throwable {
		
		VoteListCriteria criteria = new VoteListCriteria();
		
		criteria.setLimit(50);
		criteria.setPage(page.orElse(1));
		criteria.setRound(round);
		criteria.setToAddress(address);;
		
		return this.voteService.listVotes(criteria);		
	}	




	
}
