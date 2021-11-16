  Feature: Como alumno de Crowdar QA Automation, quiero resolver el integrador de mobile

    @Demo
    Scenario Outline: 1)The user starts the application and log in to the app.
      Given The app is loaded correctly
      And The user logs in the application with: <email>, <password>
      Then The user log in satisfactory
      @Demo
      Examples:
        | email                  | password   |
        | aaquino@cidecom.com.ar | 12345678   |


    @Demo
    Scenario Outline: 2)the user change value in button.
      Given The app is loaded correctly
      And The user logs in the application with: <email>, <password>
      Then The user log in satisfactory
      And The user presses tap-nav
      And The user presses settings
      And The user presses dark mode
      Then Dark mode is enabled
      @Demo
      Examples:
        | email                  | password   |
        | aaquino@cidecom.com.ar | 12345678   |


    @Demo
    Scenario Outline: 3)the user set a ticket.
      Given The app is loaded correctly
      And The user logs in the application with: <email>, <password>
      Then The user log in satisfactory
      And The user presses time entries button
      And The user changes the hours
      And The user set a project
      And The user select a project
      And The user presses save
      Then the user verify that the ticket was created "<project>"


      @Demo2
      Examples:
        | email                  | password   | project          |
        | aaquino@cidecom.com.ar | 12345678   | Proyecto_Academy |