import org.acef304.RaiffParser

println("test")


val t = RaiffParser.parseFile("test_data/card_statement_01.01.17-09.04.17.csv")

t.toArray.length