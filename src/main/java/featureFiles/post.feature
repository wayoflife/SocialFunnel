Feature: post

As a logged in user
I want to publish a post
on several networks

Scenario: Publish empty Post
	Given I dont enter anything in the field "Post verfassen"
	And I press the "Post veröffentlichen" button
	Then I receive an error message, that a Post cannot be empty
	
Scenario: Publish a Post
	Given I enter my "post" into the field "Post verfassen"
	And I press the "Post veröffentlichen" button
	And I checked which "networks" should it be posted on
	Then My post will be pusblished