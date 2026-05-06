package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.PutPaperReviewDTO;
import tw.org.dtcss.pojo.VO.AssignedReviewersVO;
import tw.org.dtcss.pojo.VO.ReviewerScoreStatsVO;
import tw.org.dtcss.pojo.entity.PaperAndPaperReviewer;

@Mapper(componentModel = "spring")
public interface PaperAndPaperReviewerConvert {


	PaperAndPaperReviewer putDTOToEntity(PutPaperReviewDTO putPaperReviewDTO);

	AssignedReviewersVO entityToAssignedReviewersVO(PaperAndPaperReviewer paperAndPaperReviewer);

	ReviewerScoreStatsVO entityToReviewerScoreStatsVO(PaperAndPaperReviewer paperAndPaperReviewer);
}
