# CODING PROBLEM: Extend create account page by a new attribte

A	Finnish	company	named	Suomi	Software	Services	provides	Software	
Consulting	Services	to	different	companies	and	have	built	a	portal	based	
on	Liferay	Portal	DXP	to	support	its	business.	
In	order	to	have	a	customized	experience	with	its	customers,	Suomi	
Software	Services	wants	to	have	one	organization	and	web	site	per	
customer.	The	Portal	Administrator	of	Suomi	Software	Services	will	
create	one	organization	for	each	of	their	customers,	and	he	will	assign	
one	Registration	Code	per	organization.	
The	employees	of	each	customer	are	assumed	to	know	the	Registration	
Code	of	their	company.		
The	employees	will	need	to	fill	the	Registration	Code	in	the	form	when	
creating	an	account.	
If	the	Registration	Code	doesn't	match	any	of	the	companies	registered	in	
Suomi	Software	Services	portal,	the	account	won't	be	created	and	an	
error	notifying	that	the	Code	is	not	valid	will	be	displayed.	
If	the	Registration	Code	matches	one	of	the	companies,	the	account	will	
be	created	and	the	employee	will	be	automatically	assigned	to	the	
respective	organization.	
This	solution	must	be	implemented	as	a	Liferay	extension	and	the	end	
result	must	be	a	files	that	can	be	deployed	to	a	running	Liferay	DXP	
installation.	

# Solution

* make custom attribute to a organization called registration-code by type of text.
* setup permission and visibility

