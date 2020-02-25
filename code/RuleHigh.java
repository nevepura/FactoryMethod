class RuleHigh implements Rule{
	RuleApplier getRuleApplier(){
		return new RuleHighApplier();
	}
}