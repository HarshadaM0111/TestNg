Feature: QA Registration

Scenario Outline: verify the register success with five credential

Given Register page should be luanch in egdebroweser
When Enter the firstname as "<firstname>" and lastname as "<lastname>"
And enter the username as "<username>" and password as "<password>"
Then register should successful with three records

Examples:
| firstname | lastname  | username | password   |
| Harshada    | Mane      | hmane   | h@123  |
| hrushi    | choudhari | hrushi_c | hrushi@123 |
| harshada  | mane      | h_mane   | mane@123   |