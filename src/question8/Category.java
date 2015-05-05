package question8;

public class Category {
	// Contructor – parent category is assume to exist.
	// Top level categories are passed null as the parent.
	public Category(String name, Category parent) {
		// ...
	}

	// Add a subcategory to the list for this category, if it does
	// not already exist.
	private void addSubcategory(Category child) {
	}

	// Remove a subcategory from the list for this category, if
	// it is present
	private void removeSubcategory(Category child) {
	}

	// Set or change the category's parent category.
	// Automatically removes this category from its current parent's list.
	// and adds it to the new parent's list
	// Parameter parent may be null (for top level categories)
	public void setParent(Category newParent) {
	}

	// Add a site that will appear in this category’s page, if it does
	// not already exist.
	public void addSite(Site site) {
	}

	// Remove a site from the category, if it exists.
	public void removeSite(Site site) {
	}

	// Get a listing of all sites for this the category
	public Site[] getSites() {
		return null;
	}

	// Get a list of all the categories which have the current
	// category as a parent in the ontology tree
	public Category[] getSubcategories() {
		return null;
	}

	// Get a sequence of categories, from the highest level to the
	// current one, to show the ontology hierarchy that leads to this node
	public Category[] getPath() {
		return null;
	}

}
