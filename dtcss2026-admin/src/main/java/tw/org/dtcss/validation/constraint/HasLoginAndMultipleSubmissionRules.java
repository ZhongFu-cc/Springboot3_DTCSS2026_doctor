package tw.org.dtcss.validation.constraint;

import tw.org.dtcss.enums.CommonStatusEnum;

public interface HasLoginAndMultipleSubmissionRules {

	public CommonStatusEnum getRequireLogin();
	public CommonStatusEnum getAllowMultipleSubmissions();
	
}
