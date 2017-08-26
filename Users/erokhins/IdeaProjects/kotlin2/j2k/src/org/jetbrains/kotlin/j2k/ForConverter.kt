'codeConverter' @ [30:37] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'converter' @ [30:51] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [30:61] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'codeConverter' @ [31:28] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'settings' @ [31:42] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'codeConverter' @ [32:27] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'converter' @ [32:41] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'project' @ [32:51] ==> public final val project: Project defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'statement' @ [34:34] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'initialization' @ [34:44] ==> public final val PsiForStatement.initialization: PsiStatement?[MyPropertyDescriptor]

'statement' @ [35:26] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'update' @ [35:36] ==> public final val PsiForStatement.update: PsiStatement?[MyPropertyDescriptor]

'statement' @ [36:29] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'condition' @ [36:39] ==> public final val PsiForStatement.condition: PsiExpression?[MyPropertyDescriptor]

'statement' @ [37:24] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'body' @ [37:34] ==> public final val PsiForStatement.body: PsiStatement?[MyPropertyDescriptor]

'convertToForeach' @ [40:23] ==> private final fun convertToForeach(): ForeachStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'foreach' @ [41:13] ==> val foreach: ForeachStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'foreach' @ [41:37] ==> val foreach: ForeachStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'statement' @ [43:30] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'initialization' @ [43:40] ==> public final val PsiForStatement.initialization: PsiStatement?[MyPropertyDescriptor]

'statement' @ [44:22] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'update' @ [44:32] ==> public final val PsiForStatement.update: PsiStatement?[MyPropertyDescriptor]

'statement' @ [45:25] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'condition' @ [45:35] ==> public final val PsiForStatement.condition: PsiExpression?[MyPropertyDescriptor]

'statement' @ [46:20] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'body' @ [46:30] ==> public final val PsiForStatement.body: PsiStatement?[MyPropertyDescriptor]

'codeConverter' @ [48:39] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertStatement' @ [48:53] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'initialization' @ [48:70] ==> val initialization: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'codeConverter' @ [49:31] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertStatement' @ [49:45] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'update' @ [49:62] ==> val update: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'if (updateConverted.isEmpty) {
            codeConverter.convertStatementOrBlock(body)
        }
        else {
            // we should process all continue-statements because we need to add update statement(s) before them
            val codeConverterToUse = codeConverter.withSpecialStatementConverter(object : SpecialStatementConverter {
                override fun convertStatement(statement: PsiStatement, codeConverter: CodeConverter): Statement? {
                    if (statement !is PsiContinueStatement) return null
                    if (statement.findContinuedStatement()?.toContinuedLoop() != this@ForConverter.statement) return null

                    val continueConverted = this@ForConverter.codeConverter.convertStatement(statement)
                    val statements = listOf(updateConverted, continueConverted)
                    return if (statement.parent is PsiCodeBlock) {
                        // generate fictive statement which will generate multiple statements
                        object : Statement() {
                            override fun generateCode(builder: CodeBuilder) {
                                builder.append(statements, "\n")
                            }
                        }
                    }
                    else {
                        Block.of(statements)
                    }
                }
            })

            if (body is PsiBlockStatement) {
                val nameConflict = initialization is PsiDeclarationStatement && initialization.declaredElements.any { loopVar ->
                    loopVar is PsiNamedElement && body.codeBlock.statements.any { statement ->
                        statement is PsiDeclarationStatement && statement.declaredElements.any {
                            it is PsiNamedElement && it.name == loopVar.name
                        }
                    }
                }

                if (nameConflict) {
                    val statements = listOf(codeConverterToUse.convertStatement(body), updateConverted)
                    Block.of(statements).assignNoPrototype()
                }
                else {
                    val block = codeConverterToUse.convertBlock(body.codeBlock, true)
                    Block(block.statements + listOf(updateConverted), block.lBrace, block.rBrace, true).assignPrototypesFrom(block)
                }
            }
            else {
                val statements = listOf(codeConverterToUse.convertStatement(body), updateConverted)
                Block.of(statements).assignNoPrototype()
            }
        }' @ [51:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'updateConverted' @ [51:29] ==> val updateConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'isEmpty' @ [51:45] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Statement[PropertyDescriptorImpl]

'codeConverter' @ [52:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [52:27] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'body' @ [52:51] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'codeConverter' @ [56:38] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'withSpecialStatementConverter' @ [56:52] ==> public final fun withSpecialStatementConverter(specialConverter: SpecialStatementConverter): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [58:25] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'statement' @ [59:25] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'findContinuedStatement' @ [59:35] ==> @Nullable public abstract fun findContinuedStatement(): PsiStatement? defined in com.intellij.psi.PsiContinueStatement[JavaMethodDescriptor]

'toContinuedLoop' @ [59:61] ==> private final fun PsiStatement.toContinuedLoop(): PsiLoopStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'this@ForConverter' @ [59:82] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter[LazyClassReceiverParameterDescriptor]

'statement' @ [59:100] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'this@ForConverter' @ [61:45] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter[LazyClassReceiverParameterDescriptor]

'codeConverter' @ [61:63] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertStatement' @ [61:77] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [61:94] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'listOf' @ [62:38] ==> public fun <T> listOf(vararg elements: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'updateConverted' @ [62:45] ==> val updateConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'continueConverted' @ [62:62] ==> val continueConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[LocalVariableDescriptor]

'if (statement.parent is PsiCodeBlock) {
                        // generate fictive statement which will generate multiple statements
                        object : Statement() {
                            override fun generateCode(builder: CodeBuilder) {
                                builder.append(statements, "\n")
                            }
                        }
                    }
                    else {
                        Block.of(statements)
                    }' @ [63:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement?, elseBranch: Statement?): Statement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement?

'statement' @ [63:32] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'parent' @ [63:42] ==> public final val PsiContinueStatement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'Statement' @ [65:34] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [67:33] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement.<no name provided>.generateCode[ValueParameterDescriptorImpl]

'append' @ [67:41] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'statements' @ [67:48] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[LocalVariableDescriptor]

'of' @ [72:31] ==> public final fun of(statements: List<Statement>): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'statements' @ [72:34] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<no name provided>.convertStatement[LocalVariableDescriptor]

'if (body is PsiBlockStatement) {
                val nameConflict = initialization is PsiDeclarationStatement && initialization.declaredElements.any { loopVar ->
                    loopVar is PsiNamedElement && body.codeBlock.statements.any { statement ->
                        statement is PsiDeclarationStatement && statement.declaredElements.any {
                            it is PsiNamedElement && it.name == loopVar.name
                        }
                    }
                }

                if (nameConflict) {
                    val statements = listOf(codeConverterToUse.convertStatement(body), updateConverted)
                    Block.of(statements).assignNoPrototype()
                }
                else {
                    val block = codeConverterToUse.convertBlock(body.codeBlock, true)
                    Block(block.statements + listOf(updateConverted), block.lBrace, block.rBrace, true).assignPrototypesFrom(block)
                }
            }
            else {
                val statements = listOf(codeConverterToUse.convertStatement(body), updateConverted)
                Block.of(statements).assignNoPrototype()
            }' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Block, elseBranch: Block): Block[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Block

'body' @ [77:17] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'initialization' @ [78:36] ==> val initialization: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'initialization' @ [78:81] ==> val initialization: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'declaredElements' @ [78:96] ==> public final val PsiDeclarationStatement.declaredElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'any' @ [78:113] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'loopVar' @ [79:21] ==> value-parameter loopVar: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [79:51] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'codeBlock' @ [79:56] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'statements' @ [79:66] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'any' @ [79:77] ==> public inline fun <T> Array<out (PsiStatement..PsiStatement?)>.any(predicate: ((PsiStatement..PsiStatement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'statement' @ [80:25] ==> value-parameter statement: (PsiStatement..PsiStatement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [80:65] ==> value-parameter statement: (PsiStatement..PsiStatement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaredElements' @ [80:75] ==> public final val PsiDeclarationStatement.declaredElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'any' @ [80:92] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [81:29] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [81:54] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:57] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'loopVar' @ [81:65] ==> value-parameter loopVar: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:73] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'if (nameConflict) {
                    val statements = listOf(codeConverterToUse.convertStatement(body), updateConverted)
                    Block.of(statements).assignNoPrototype()
                }
                else {
                    val block = codeConverterToUse.convertBlock(body.codeBlock, true)
                    Block(block.statements + listOf(updateConverted), block.lBrace, block.rBrace, true).assignPrototypesFrom(block)
                }' @ [86:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Block, elseBranch: Block): Block[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Block

'nameConflict' @ [86:21] ==> val nameConflict: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'listOf' @ [87:38] ==> public fun <T> listOf(vararg elements: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'codeConverterToUse' @ [87:45] ==> val codeConverterToUse: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'convertStatement' @ [87:64] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'body' @ [87:81] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'updateConverted' @ [87:88] ==> val updateConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'of' @ [88:27] ==> public final fun of(statements: List<Statement>): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'statements' @ [88:30] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'assignNoPrototype' @ [88:42] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'codeConverterToUse' @ [91:33] ==> val codeConverterToUse: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'convertBlock' @ [91:52] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'body' @ [91:65] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'codeBlock' @ [91:70] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'Block' @ [92:21] ==> public constructor Block(statements: List<Statement>, lBrace: LBrace, rBrace: RBrace, notEmpty: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.Block[ClassConstructorDescriptorImpl]

'block' @ [92:27] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'statements' @ [92:33] ==> public final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'listOf' @ [92:46] ==> public fun <T> listOf(element: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'updateConverted' @ [92:53] ==> val updateConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'block' @ [92:71] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'lBrace' @ [92:77] ==> public final val lBrace: LBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'block' @ [92:85] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'rBrace' @ [92:91] ==> public final val rBrace: RBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'assignPrototypesFrom' @ [92:105] ==> public fun <TElement : Element> Block.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'block' @ [92:126] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'listOf' @ [96:34] ==> public fun <T> listOf(vararg elements: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'codeConverterToUse' @ [96:41] ==> val codeConverterToUse: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'convertStatement' @ [96:60] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'body' @ [96:77] ==> val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'updateConverted' @ [96:84] ==> val updateConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'of' @ [97:23] ==> public final fun of(statements: List<Statement>): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'statements' @ [97:26] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'assignNoPrototype' @ [97:38] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'WhileStatement' @ [101:30] ==> public constructor WhileStatement(condition: Expression, body: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[ClassConstructorDescriptorImpl]

'if (condition != null) codeConverter.convertExpression(condition) else LiteralExpression("true").assignNoPrototype()' @ [102:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'condition' @ [102:21] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'codeConverter' @ [102:40] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [102:54] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [102:72] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'LiteralExpression' @ [102:88] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [102:114] ==> public fun <TElement : Element> LiteralExpression.assignNoPrototype(): LiteralExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LiteralExpression

'whileBody' @ [103:17] ==> val whileBody: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'statement' @ [104:17] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'isInSingleLine' @ [104:27] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [104:45] ==> public fun <TElement : Element> WhileStatement.assignNoPrototype(): WhileStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> WhileStatement

'initializationConverted' @ [105:13] ==> val initializationConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'isEmpty' @ [105:37] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Statement[PropertyDescriptorImpl]

'whileStatement' @ [105:53] ==> val whileStatement: WhileStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'when {
            statement.parents.filter { it !is PsiLabeledStatement }.first() !is PsiCodeBlock ->
                WhileWithInitializationPseudoStatement.Kind.WITH_BLOCK
            hasNameConflict() ->
                WhileWithInitializationPseudoStatement.Kind.WITH_RUN_BLOCK
            else ->
                WhileWithInitializationPseudoStatement.Kind.SIMPLE
        }' @ [107:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ForConverter.WhileWithInitializationPseudoStatement.Kind, entry1: ForConverter.WhileWithInitializationPseudoStatement.Kind, entry2: ForConverter.WhileWithInitializationPseudoStatement.Kind): ForConverter.WhileWithInitializationPseudoStatement.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Kind

'statement' @ [108:13] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'parents' @ [108:23] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filter' @ [108:31] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [108:40] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.j2k.ForConverter.execute.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [108:69] ==> public fun <T> Sequence<PsiElement>.first(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'WITH_BLOCK' @ [109:61] ==> enum entry WITH_BLOCK defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.Kind[FakeCallableDescriptorForObject]

'hasNameConflict' @ [110:13] ==> private final fun hasNameConflict(): Boolean defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'WITH_RUN_BLOCK' @ [111:61] ==> enum entry WITH_RUN_BLOCK defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.Kind[FakeCallableDescriptorForObject]

'SIMPLE' @ [113:61] ==> enum entry SIMPLE defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.Kind[FakeCallableDescriptorForObject]

'WhileWithInitializationPseudoStatement' @ [115:16] ==> public constructor WhileWithInitializationPseudoStatement(initialization: Statement, loop: Statement, kind: ForConverter.WhileWithInitializationPseudoStatement.Kind) defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[ClassConstructorDescriptorImpl]

'initializationConverted' @ [115:55] ==> val initializationConverted: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'whileStatement' @ [115:80] ==> val whileStatement: WhileStatement defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'kind' @ [115:96] ==> val kind: ForConverter.WhileWithInitializationPseudoStatement.Kind defined in org.jetbrains.kotlin.j2k.ForConverter.execute[LocalVariableDescriptor]

'Statement' @ [122:9] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'listOf' @ [130:34] ==> public fun <T> listOf(vararg elements: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'initialization' @ [130:41] ==> public final val initialization: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'loop' @ [130:57] ==> public final val loop: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'if (kind == Kind.SIMPLE) {
                builder.append(statements, "\n")
            }
            else {
                val block = Block.of(statements).assignNoPrototype()
                if (kind == Kind.WITH_BLOCK) {
                    block.generateCode(builder)
                }
                else {
                    val argumentList = ArgumentList.withNoPrototype(LambdaExpression(null, block))
                    val call = MethodCallExpression.buildNonNull(null, "run", argumentList)
                    call.generateCode(builder)
                }
            }' @ [133:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'kind' @ [133:17] ==> public final val kind: ForConverter.WhileWithInitializationPseudoStatement.Kind defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'SIMPLE' @ [133:30] ==> enum entry SIMPLE defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.Kind[FakeCallableDescriptorForObject]

'builder' @ [134:17] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [134:25] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'statements' @ [134:32] ==> private final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'Block' @ [137:29] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'of' @ [137:35] ==> public final fun of(statements: List<Statement>): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'statements' @ [137:38] ==> private final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'assignNoPrototype' @ [137:50] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'if (kind == Kind.WITH_BLOCK) {
                    block.generateCode(builder)
                }
                else {
                    val argumentList = ArgumentList.withNoPrototype(LambdaExpression(null, block))
                    val call = MethodCallExpression.buildNonNull(null, "run", argumentList)
                    call.generateCode(builder)
                }' @ [138:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kind' @ [138:21] ==> public final val kind: ForConverter.WhileWithInitializationPseudoStatement.Kind defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'WITH_BLOCK' @ [138:34] ==> enum entry WITH_BLOCK defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.Kind[FakeCallableDescriptorForObject]

'block' @ [139:21] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[LocalVariableDescriptor]

'generateCode' @ [139:27] ==> public open fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Block[SimpleFunctionDescriptorImpl]

'builder' @ [139:40] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[ValueParameterDescriptorImpl]

'ArgumentList' @ [142:40] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [142:53] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'LambdaExpression' @ [142:69] ==> public constructor LambdaExpression(parameterList: ParameterList?, block: Block) defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[ClassConstructorDescriptorImpl]

'block' @ [142:92] ==> val block: Block defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[LocalVariableDescriptor]

'MethodCallExpression' @ [143:32] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [143:53] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'argumentList' @ [143:79] ==> val argumentList: ArgumentList defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[LocalVariableDescriptor]

'call' @ [144:21] ==> val call: MethodCallExpression defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[LocalVariableDescriptor]

'generateCode' @ [144:26] ==> public open fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[SimpleFunctionDescriptorImpl]

'builder' @ [144:39] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement.generateCode[ValueParameterDescriptorImpl]

'initialization' @ [151:13] ==> private final val initialization: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'initialization' @ [152:27] ==> private final val initialization: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'declaredElements' @ [152:42] ==> public final val PsiDeclarationStatement.declaredElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [152:59] ==> public fun <T> Array<out (PsiElement..PsiElement?)>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'!' @ [153:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'loopVar' @ [153:18] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'hasWriteAccesses' @ [153:26] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [153:43] ==> private final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'body' @ [153:62] ==> private final val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'!' @ [154:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'loopVar' @ [154:21] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'hasWriteAccesses' @ [154:29] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'referenceSearcher' @ [154:46] ==> private final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'condition' @ [154:65] ==> private final val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'condition' @ [155:20] ==> private final val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'condition' @ [157:28] ==> private final val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'lOperand' @ [157:38] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'condition' @ [158:29] ==> private final val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'rOperand' @ [158:39] ==> public final val PsiBinaryExpression.rOperand: PsiExpression?[MyPropertyDescriptor]

'right' @ [159:21] ==> val right: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'type' @ [159:27] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'DOUBLE' @ [159:43] ==> public final val DOUBLE: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'right' @ [159:53] ==> val right: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'type' @ [159:59] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'FLOAT' @ [159:75] ==> public final val FLOAT: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'right' @ [159:84] ==> val right: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'type' @ [159:90] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'CHAR' @ [159:106] ==> public final val CHAR: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'left' @ [163:21] ==> val left: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'resolve' @ [163:26] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'loopVar' @ [163:39] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'loopVar' @ [164:33] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'initializer' @ [164:41] ==> public final var PsiLocalVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'update' @ [165:42] ==> private final val update: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'expression' @ [165:78] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'isVariableIncrementOrDecrement' @ [165:90] ==> private final fun PsiElement.isVariableIncrementOrDecrement(variable: PsiVariable): IElementType? defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'loopVar' @ [165:121] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'when (operationType) {
                        JavaTokenType.PLUSPLUS -> false
                        JavaTokenType.MINUSMINUS -> true
                        else -> return null
                    }' @ [166:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'operationType' @ [166:42] ==> val operationType: IElementType? defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'PLUSPLUS' @ [167:39] ==> public final val PLUSPLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUSMINUS' @ [168:39] ==> public final val MINUSMINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'when (condition.operationTokenType) {
                        JavaTokenType.LT -> if (reversed) return null else false
                        JavaTokenType.LE -> if (reversed) return null else true
                        JavaTokenType.GT -> if (reversed) false else return null
                        JavaTokenType.GE -> if (reversed) true else return null
                        JavaTokenType.NE -> false
                        else -> return null
                    }' @ [172:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'condition' @ [172:43] ==> private final val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'operationTokenType' @ [172:53] ==> public final val PsiBinaryExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'LT' @ [173:39] ==> public final val LT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'if (reversed) return null else false' @ [173:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reversed' @ [173:49] ==> val reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'LE' @ [174:39] ==> public final val LE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'if (reversed) return null else true' @ [174:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reversed' @ [174:49] ==> val reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'GT' @ [175:39] ==> public final val GT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'if (reversed) false else return null' @ [175:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reversed' @ [175:49] ==> val reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'GE' @ [176:39] ==> public final val GE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'if (reversed) true else return null' @ [176:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reversed' @ [176:49] ==> val reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'NE' @ [177:39] ==> public final val NE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'forIterationRange' @ [181:33] ==> private final fun forIterationRange(start: PsiExpression, bound: PsiExpression, reversed: Boolean, inclusiveComparison: Boolean): Expression defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'start' @ [181:51] ==> val start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'right' @ [181:58] ==> val right: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'reversed' @ [181:65] ==> val reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'inclusive' @ [181:75] ==> val inclusive: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'assignNoPrototype' @ [181:86] ==> public fun <TElement : Element> Expression.assignNoPrototype(): Expression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Expression

'if (settings.specifyLocalVariableTypeByDefault)
                        PrimitiveType(Identifier.withNoPrototype("Int")).assignNoPrototype()
                    else
                        null' @ [182:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrimitiveType?, elseBranch: PrimitiveType?): PrimitiveType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrimitiveType?

'settings' @ [182:44] ==> private final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'specifyLocalVariableTypeByDefault' @ [182:53] ==> public final var specifyLocalVariableTypeByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'PrimitiveType' @ [183:25] ==> public constructor PrimitiveType(name: Identifier) defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType[ClassConstructorDescriptorImpl]

'withNoPrototype' @ [183:50] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'assignNoPrototype' @ [183:74] ==> public fun <TElement : Element> PrimitiveType.assignNoPrototype(): PrimitiveType defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PrimitiveType

'ForeachStatement' @ [186:28] ==> public constructor ForeachStatement(variableName: Identifier, explicitVariableType: Type?, collection: Expression, body: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[ClassConstructorDescriptorImpl]

'loopVar' @ [186:45] ==> val loopVar: PsiLocalVariable defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'declarationIdentifier' @ [186:53] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'explicitType' @ [186:78] ==> val explicitType: PrimitiveType? defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'range' @ [186:92] ==> val range: Expression defined in org.jetbrains.kotlin.j2k.ForConverter.convertToForeach[LocalVariableDescriptor]

'codeConverter' @ [186:99] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [186:113] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'body' @ [186:137] ==> private final val body: PsiStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'statement' @ [186:144] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'isInSingleLine' @ [186:154] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'when (this) {
            is PsiPostfixExpression -> operationTokenType to operand
            is PsiPrefixExpression -> operationTokenType to operand
            else -> return null
        }' @ [195:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<IElementType, PsiExpression?>, entry1: Pair<IElementType, PsiExpression?>, entry2: Pair<IElementType, PsiExpression?>): Pair<IElementType, PsiExpression?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<IElementType, PsiExpression?>

'this' @ [195:26] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.isVariableIncrementOrDecrement[ReceiverParameterDescriptorImpl]

'operationTokenType' @ [196:40] ==> public final val PsiPostfixExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'operand' @ [196:62] ==> public final val PsiPostfixExpression.operand: PsiExpression[MyPropertyDescriptor]

'operationTokenType' @ [197:39] ==> public final val PsiPrefixExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'operand' @ [197:61] ==> public final val PsiPrefixExpression.operand: PsiExpression?[MyPropertyDescriptor]

'!=' @ [200:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'pair' @ [200:14] ==> val pair: Pair<IElementType, PsiExpression?> defined in org.jetbrains.kotlin.j2k.ForConverter.isVariableIncrementOrDecrement[LocalVariableDescriptor]

'second' @ [200:19] ==> public final val second: PsiExpression? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'resolve' @ [200:55] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'variable' @ [200:68] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.ForConverter.isVariableIncrementOrDecrement[ValueParameterDescriptorImpl]

'pair' @ [201:16] ==> val pair: Pair<IElementType, PsiExpression?> defined in org.jetbrains.kotlin.j2k.ForConverter.isVariableIncrementOrDecrement[LocalVariableDescriptor]

'first' @ [201:21] ==> public final val first: IElementType defined in kotlin.Pair[DeserializedPropertyDescriptor]

'indicesIterationRange' @ [205:28] ==> private final fun indicesIterationRange(start: PsiExpression, bound: PsiExpression, reversed: Boolean, inclusiveComparison: Boolean): Expression? defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'start' @ [205:50] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'bound' @ [205:57] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'reversed' @ [205:64] ==> value-parameter reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'inclusiveComparison' @ [205:74] ==> value-parameter inclusiveComparison: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'indicesRange' @ [206:13] ==> val indicesRange: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[LocalVariableDescriptor]

'indicesRange' @ [206:42] ==> val indicesRange: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[LocalVariableDescriptor]

'codeConverter' @ [208:30] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [208:44] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'start' @ [208:62] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'if (reversed)
            DownToExpression(startConverted, convertBound(bound, if (inclusiveComparison) 0 else +1))
        else
            RangeExpression(startConverted, convertBound(bound, if (inclusiveComparison) 0 else -1))' @ [209:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'reversed' @ [209:20] ==> value-parameter reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'DownToExpression' @ [210:13] ==> public constructor DownToExpression(start: Expression, end: Expression) defined in org.jetbrains.kotlin.j2k.ast.DownToExpression[ClassConstructorDescriptorImpl]

'startConverted' @ [210:30] ==> val startConverted: Expression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[LocalVariableDescriptor]

'convertBound' @ [210:46] ==> private final fun convertBound(bound: PsiExpression, correction: Int): Expression defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'bound' @ [210:59] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'if (inclusiveComparison) 0 else +1' @ [210:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'inclusiveComparison' @ [210:70] ==> value-parameter inclusiveComparison: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'+' @ [210:98] ==> public final operator fun unaryPlus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'RangeExpression' @ [212:13] ==> public constructor RangeExpression(start: Expression, end: Expression) defined in org.jetbrains.kotlin.j2k.ast.RangeExpression[ClassConstructorDescriptorImpl]

'startConverted' @ [212:29] ==> val startConverted: Expression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[LocalVariableDescriptor]

'convertBound' @ [212:45] ==> private final fun convertBound(bound: PsiExpression, correction: Int): Expression defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'bound' @ [212:58] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'if (inclusiveComparison) 0 else -1' @ [212:65] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'inclusiveComparison' @ [212:69] ==> value-parameter inclusiveComparison: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.forIterationRange[ValueParameterDescriptorImpl]

'-' @ [212:97] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (reversed) {
            if (!inclusiveComparison) return null

            if ((bound as? PsiLiteralExpression)?.value != 0) return null

            if (start !is PsiBinaryExpression) return null
            if (start.operationTokenType != JavaTokenType.MINUS) return null
            if ((start.rOperand as? PsiLiteralExpression)?.value != 1) return null
            start.lOperand
        }
        else {
            if (inclusiveComparison) return null
            if ((start as? PsiLiteralExpression)?.value != 0) return null
            bound
        }' @ [216:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiExpression, elseBranch: PsiExpression): PsiExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiExpression

'reversed' @ [216:34] ==> value-parameter reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'!' @ [217:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inclusiveComparison' @ [217:18] ==> value-parameter inclusiveComparison: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'!=' @ [219:17] ==> public open operator fun equals(other: Any?): Boolean defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'bound' @ [219:18] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'value' @ [219:51] ==> public final val PsiLiteralExpression.value: Any?[MyPropertyDescriptor]

'start' @ [221:17] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'start' @ [222:17] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'operationTokenType' @ [222:23] ==> public final val PsiBinaryExpression.operationTokenType: IElementType[MyPropertyDescriptor]

'MINUS' @ [222:59] ==> public final val MINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'!=' @ [223:17] ==> public open operator fun equals(other: Any?): Boolean defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'start' @ [223:18] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'rOperand' @ [223:24] ==> public final val PsiBinaryExpression.rOperand: PsiExpression?[MyPropertyDescriptor]

'value' @ [223:60] ==> public final val PsiLiteralExpression.value: Any?[MyPropertyDescriptor]

'start' @ [224:13] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'lOperand' @ [224:19] ==> public final val PsiBinaryExpression.lOperand: PsiExpression[MyPropertyDescriptor]

'inclusiveComparison' @ [227:17] ==> value-parameter inclusiveComparison: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'!=' @ [228:17] ==> public open operator fun equals(other: Any?): Boolean defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'start' @ [228:18] ==> value-parameter start: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'value' @ [228:51] ==> public final val PsiLiteralExpression.value: Any?[MyPropertyDescriptor]

'bound' @ [229:13] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'if (collectionSize is PsiMethodCallExpression && collectionSize.argumentList.expressions.isEmpty()) {
            val methodExpr = collectionSize.methodExpression
            if (methodExpr.referenceName == "size") {
                val qualifier = methodExpr.qualifierExpression
                if (qualifier is PsiReferenceExpression /* we don't convert to .indices if qualifier is method call or something because of possible side effects */) {
                    val collectionType = PsiElementFactory.SERVICE.getInstance(project).createTypeByFQClassName(CommonClassNames.JAVA_UTIL_COLLECTION)
                    val qualifierType = qualifier.type
                    if (qualifierType != null && collectionType.isAssignableFrom(qualifierType)) {
                        indices = QualifiedExpression(codeConverter.convertExpression(qualifier), Identifier.withNoPrototype("indices", isNullable = false), null)
                    }
                }
            }
        }
        // check if it's iteration through array indices
        else if (collectionSize is PsiReferenceExpression /* we don't convert to .indices if qualifier is method call or something because of possible side effects */
            && collectionSize.referenceName == "length") {
            val qualifier = collectionSize.qualifierExpression
            if (qualifier is PsiReferenceExpression && qualifier.type is PsiArrayType) {
                indices = QualifiedExpression(codeConverter.convertExpression(qualifier), Identifier.withNoPrototype("indices", isNullable = false), null)
            }
        }' @ [236:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'collectionSize' @ [236:13] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'collectionSize' @ [236:58] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'argumentList' @ [236:73] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [236:86] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'isEmpty' @ [236:98] ==> @InlineOnly public inline fun <T> Array<out (PsiExpression..PsiExpression?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'collectionSize' @ [237:30] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'methodExpression' @ [237:45] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'methodExpr' @ [238:17] ==> val methodExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'referenceName' @ [238:28] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'methodExpr' @ [239:33] ==> val methodExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'qualifierExpression' @ [239:44] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'qualifier' @ [240:21] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'getInstance' @ [241:68] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [241:80] ==> private final val project: Project defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'createTypeByFQClassName' @ [241:89] ==> @NotNull public abstract fun createTypeByFQClassName(@NotNull @NonNls p0: String): PsiClassType defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'JAVA_UTIL_COLLECTION' @ [241:130] ==> @NonNls public const final val JAVA_UTIL_COLLECTION: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'qualifier' @ [242:41] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'type' @ [242:51] ==> public final val PsiReferenceExpression.type: PsiType?[MyPropertyDescriptor]

'qualifierType' @ [243:25] ==> val qualifierType: PsiType? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'collectionType' @ [243:50] ==> val collectionType: PsiClassType defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'isAssignableFrom' @ [243:65] ==> public open fun isAssignableFrom(@NotNull p0: PsiType): Boolean defined in com.intellij.psi.PsiClassType[JavaMethodDescriptor]

'qualifierType' @ [243:82] ==> val qualifierType: PsiType? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'indices' @ [244:25] ==> var indices: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'QualifiedExpression' @ [244:35] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'codeConverter' @ [244:55] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [244:69] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'qualifier' @ [244:87] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'withNoPrototype' @ [244:110] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'collectionSize' @ [250:18] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'collectionSize' @ [251:16] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'referenceName' @ [251:31] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'collectionSize' @ [252:29] ==> val collectionSize: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'qualifierExpression' @ [252:44] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'qualifier' @ [253:17] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'qualifier' @ [253:56] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'type' @ [253:66] ==> public final val PsiReferenceExpression.type: PsiType?[MyPropertyDescriptor]

'indices' @ [254:17] ==> var indices: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'QualifiedExpression' @ [254:27] ==> public constructor QualifiedExpression(qualifier: Expression, identifier: Expression, dotPrototype: PsiElement?) defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[ClassConstructorDescriptorImpl]

'codeConverter' @ [254:47] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [254:61] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'qualifier' @ [254:79] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'withNoPrototype' @ [254:102] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'indices' @ [258:13] ==> var indices: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'if (reversed)
            MethodCallExpression.buildNonNull(indices.assignNoPrototype(), "reversed")
        else
            indices' @ [260:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression?, elseBranch: Expression?): Expression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression?

'reversed' @ [260:20] ==> value-parameter reversed: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[ValueParameterDescriptorImpl]

'buildNonNull' @ [261:34] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'indices' @ [261:47] ==> var indices: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'assignNoPrototype' @ [261:55] ==> public fun <TElement : Element> Expression.assignNoPrototype(): Expression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Expression

'indices' @ [263:13] ==> var indices: Expression? defined in org.jetbrains.kotlin.j2k.ForConverter.indicesIterationRange[LocalVariableDescriptor]

'correction' @ [267:13] ==> value-parameter correction: Int defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'codeConverter' @ [268:20] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [268:34] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'bound' @ [268:52] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'bound' @ [271:13] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'bound' @ [272:25] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'value' @ [272:31] ==> public final val PsiLiteralExpression.value: Any?[MyPropertyDescriptor]

'value' @ [273:17] ==> val value: Any? defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[LocalVariableDescriptor]

'LiteralExpression' @ [274:24] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'value' @ [274:43] ==> val value: Any? defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[LocalVariableDescriptor]

'correction' @ [274:51] ==> value-parameter correction: Int defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'toString' @ [274:63] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assignPrototype' @ [274:75] ==> public fun <TElement : Element> LiteralExpression.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): LiteralExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LiteralExpression

'bound' @ [274:91] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'codeConverter' @ [278:25] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'convertExpression' @ [278:39] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'bound' @ [278:57] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'if (correction > 0) JavaTokenType.PLUS else JavaTokenType.MINUS' @ [279:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (IElementType..IElementType?), elseBranch: (IElementType..IElementType?)): (IElementType..IElementType?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'correction' @ [279:24] ==> value-parameter correction: Int defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'PLUS' @ [279:54] ==> public final val PLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUS' @ [279:78] ==> public final val MINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'BinaryExpression' @ [280:16] ==> public constructor BinaryExpression(left: Expression, right: Expression, op: Operator) defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[ClassConstructorDescriptorImpl]

'converted' @ [280:33] ==> val converted: Expression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[LocalVariableDescriptor]

'LiteralExpression' @ [280:44] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'abs' @ [280:67] ==> public open fun abs(p0: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'correction' @ [280:71] ==> value-parameter correction: Int defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'toString' @ [280:83] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assignNoPrototype' @ [280:95] ==> public fun <TElement : Element> LiteralExpression.assignNoPrototype(): LiteralExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LiteralExpression

'Operator' @ [280:116] ==> public constructor Operator(operatorType: IElementType) defined in org.jetbrains.kotlin.j2k.ast.Operator[ClassConstructorDescriptorImpl]

'sign' @ [280:125] ==> val sign: (IElementType..IElementType?) defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[LocalVariableDescriptor]

'assignPrototype' @ [280:131] ==> public fun <TElement : Element> Operator.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Operator defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Operator

'bound' @ [280:147] ==> value-parameter bound: PsiExpression defined in org.jetbrains.kotlin.j2k.ForConverter.convertBound[ValueParameterDescriptorImpl]

'assignNoPrototype' @ [280:155] ==> public fun <TElement : Element> BinaryExpression.assignNoPrototype(): BinaryExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> BinaryExpression

'when (this) {
            is PsiLoopStatement -> this
            is PsiLabeledStatement -> this.statement?.toContinuedLoop()
            else -> null
        }' @ [284:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiLoopStatement?, entry1: PsiLoopStatement?, entry2: PsiLoopStatement?): PsiLoopStatement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiLoopStatement?

'this' @ [284:22] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.toContinuedLoop[ReceiverParameterDescriptorImpl]

'this' @ [285:36] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.toContinuedLoop[ReceiverParameterDescriptorImpl]

'this' @ [286:39] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.toContinuedLoop[ReceiverParameterDescriptorImpl]

'statement' @ [286:44] ==> public final val PsiLabeledStatement.statement: PsiStatement?[MyPropertyDescriptor]

'toContinuedLoop' @ [286:55] ==> private final fun PsiStatement.toContinuedLoop(): PsiLoopStatement? defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'statement' @ [292:21] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'initialization' @ [292:31] ==> public final val PsiForStatement.initialization: PsiStatement?[MyPropertyDescriptor]

'declaredVariableNames' @ [292:47] ==> private final fun PsiStatement.declaredVariableNames(): Collection<String> defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'names' @ [293:13] ==> val names: Collection<String> defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'isEmpty' @ [293:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [295:49] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [295:61] ==> private final val project: Project defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'names' @ [296:22] ==> val names: Collection<String> defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'factory' @ [298:17] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'createExpressionFromText' @ [298:25] ==> @NotNull public abstract fun createExpressionFromText(@NotNull p0: String, @Nullable p1: PsiElement?): PsiExpression defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'name' @ [298:50] ==> val name: String defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'statement' @ [298:56] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'refExpr' @ [303:17] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'resolve' @ [303:25] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'statement' @ [307:32] ==> private final val statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.ForConverter[PropertyDescriptorImpl]

'siblings' @ [307:42] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'laterStatement' @ [308:13] ==> val laterStatement: PsiElement defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'accept' @ [308:28] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'JavaRecursiveElementVisitor' @ [308:43] ==> public constructor JavaRecursiveElementVisitor() defined in com.intellij.psi.JavaRecursiveElementVisitor[JavaClassConstructorDescriptor]

'super' @ [310:21] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDeclarationStatement' @ [310:27] ==> public open fun visitDeclarationStatement(p0: (PsiDeclarationStatement..PsiDeclarationStatement?)): Unit defined in com.intellij.psi.JavaRecursiveElementVisitor[JavaMethodDescriptor]

'statement' @ [310:53] ==> value-parameter statement: PsiDeclarationStatement defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict.<no name provided>.visitDeclarationStatement[ValueParameterDescriptorImpl]

'statement' @ [312:25] ==> value-parameter statement: PsiDeclarationStatement defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict.<no name provided>.visitDeclarationStatement[ValueParameterDescriptorImpl]

'declaredVariableNames' @ [312:35] ==> private final fun PsiStatement.declaredVariableNames(): Collection<String> defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'any' @ [312:59] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [312:65] ==> value-parameter it: String defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict.<no name provided>.visitDeclarationStatement.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [312:71] ==> val names: Collection<String> defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'hasConflict' @ [313:25] ==> var hasConflict: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'hasConflict' @ [319:16] ==> var hasConflict: Boolean defined in org.jetbrains.kotlin.j2k.ForConverter.hasNameConflict[LocalVariableDescriptor]

'this' @ [323:36] ==> <this> defined in org.jetbrains.kotlin.j2k.ForConverter.declaredVariableNames[ReceiverParameterDescriptorImpl]

'listOf' @ [323:79] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'declarationStatement' @ [324:16] ==> val declarationStatement: PsiDeclarationStatement defined in org.jetbrains.kotlin.j2k.ForConverter.declaredVariableNames[LocalVariableDescriptor]

'declaredElements' @ [324:37] ==> public final val PsiDeclarationStatement.declaredElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [325:18] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<PsiVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiVariable

'map' @ [326:18] ==> public inline fun <T, R> Iterable<PsiVariable>.map(transform: (PsiVariable) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiVariable
    <R> -> String

'it' @ [326:24] ==> value-parameter it: PsiVariable defined in org.jetbrains.kotlin.j2k.ForConverter.declaredVariableNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [326:27] ==> public final val PsiVariable.name: String?[MyPropertyDescriptor]

