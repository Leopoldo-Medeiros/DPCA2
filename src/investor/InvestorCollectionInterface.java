package investor;

public interface InvestorCollectionInterface {
	
	public void addInvestor(Investor c);
    public void removeInvestor(Investor c);
    public InvestorIterator iterator();
	public int size();
}
