class RuleLow implements Rule{
	RuleApplier getRuleApplier(){
		return new RuleLowApplier();
	}
}