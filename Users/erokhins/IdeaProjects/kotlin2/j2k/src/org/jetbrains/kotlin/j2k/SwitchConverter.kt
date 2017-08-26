'WhenStatement' @ [29:15] ==> public constructor WhenStatement(subject: Expression, caseContainers: List<WhenEntry>) defined in org.jetbrains.kotlin.j2k.ast.WhenStatement[ClassConstructorDescriptorImpl]

'codeConverter' @ [29:29] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.SwitchConverter[PropertyDescriptorImpl]

'convertExpression' @ [29:43] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [29:61] ==> value-parameter statement: PsiSwitchStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.convert[ValueParameterDescriptorImpl]

'expression' @ [29:71] ==> public final val PsiSwitchStatement.expression: PsiExpression?[MyPropertyDescriptor]

'switchBodyToWhenEntries' @ [29:84] ==> private final fun switchBodyToWhenEntries(body: PsiCodeBlock?): List<WhenEntry> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'statement' @ [29:108] ==> value-parameter statement: PsiSwitchStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.convert[ValueParameterDescriptorImpl]

'body' @ [29:118] ==> public final val PsiSwitchStatement.body: PsiCodeBlock?[MyPropertyDescriptor]

'splitToCases' @ [36:21] ==> private final fun splitToCases(body: PsiCodeBlock?): List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'body' @ [36:34] ==> value-parameter body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[ValueParameterDescriptorImpl]

'ArrayList' @ [38:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WhenEntry

'ArrayList' @ [39:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WhenEntrySelector

'component1' @ [42:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [42:18] ==> public final operator fun component2(): SwitchConverter.Case defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'cases' @ [42:27] ==> val cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'withIndex' @ [42:33] ==> public fun <T> Iterable<SwitchConverter.Case>.withIndex(): Iterable<IndexedValue<SwitchConverter.Case>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Case

'case' @ [43:17] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'label' @ [43:22] ==> public final val label: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'result' @ [44:17] ==> val result: ArrayList<WhenEntry> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'add' @ [44:24] ==> public open fun add(element: WhenEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'WhenEntry' @ [44:28] ==> public constructor WhenEntry(selectors: List<WhenEntrySelector>, body: Statement) defined in org.jetbrains.kotlin.j2k.ast.WhenEntry[ClassConstructorDescriptorImpl]

'listOf' @ [44:38] ==> public fun <T> listOf(element: ValueWhenEntrySelector): List<ValueWhenEntrySelector> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueWhenEntrySelector

'ValueWhenEntrySelector' @ [44:45] ==> public constructor ValueWhenEntrySelector(expression: Expression) defined in org.jetbrains.kotlin.j2k.ast.ValueWhenEntrySelector[ClassConstructorDescriptorImpl]

'Empty' @ [44:79] ==> public object Empty : Expression defined in org.jetbrains.kotlin.j2k.ast.Expression[FakeCallableDescriptorForObject]

'assignNoPrototype' @ [44:86] ==> public fun <TElement : Element> ValueWhenEntrySelector.assignNoPrototype(): ValueWhenEntrySelector defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ValueWhenEntrySelector

'convertCaseStatementsToBody' @ [44:108] ==> private final fun convertCaseStatementsToBody(cases: List<SwitchConverter.Case>, caseIndex: Int): Statement defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'cases' @ [44:136] ==> val cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'i' @ [44:143] ==> val i: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'assignNoPrototype' @ [44:147] ==> public fun <TElement : Element> WhenEntry.assignNoPrototype(): WhenEntry defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> WhenEntry

'codeConverter' @ [47:23] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.SwitchConverter[PropertyDescriptorImpl]

'convertStatement' @ [47:37] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'case' @ [47:54] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'label' @ [47:59] ==> public final val label: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'if (case.label.isDefaultCase) defaultSelector = sel else pendingSelectors.add(sel)' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'case' @ [48:17] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'label' @ [48:22] ==> public final val label: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'isDefaultCase' @ [48:28] ==> public final val PsiSwitchLabelStatement.isDefaultCase: Boolean[MyPropertyDescriptor]

'defaultSelector' @ [48:43] ==> var defaultSelector: WhenEntrySelector? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'sel' @ [48:61] ==> val sel: WhenEntrySelector defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'pendingSelectors' @ [48:70] ==> var pendingSelectors: ArrayList<WhenEntrySelector> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'add' @ [48:87] ==> public open fun add(element: WhenEntrySelector): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'sel' @ [48:91] ==> val sel: WhenEntrySelector defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'case' @ [49:17] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'statements' @ [49:22] ==> public final val statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'isNotEmpty' @ [49:33] ==> @InlineOnly public inline fun <T> Collection<PsiStatement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement

'convertCaseStatementsToBody' @ [50:33] ==> private final fun convertCaseStatementsToBody(cases: List<SwitchConverter.Case>, caseIndex: Int): Statement defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'cases' @ [50:61] ==> val cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'i' @ [50:68] ==> val i: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'pendingSelectors' @ [51:21] ==> var pendingSelectors: ArrayList<WhenEntrySelector> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'isNotEmpty' @ [51:38] ==> @InlineOnly public inline fun <T> Collection<WhenEntrySelector>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenEntrySelector

'result' @ [52:21] ==> val result: ArrayList<WhenEntry> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'add' @ [52:28] ==> public open fun add(element: WhenEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'WhenEntry' @ [52:32] ==> public constructor WhenEntry(selectors: List<WhenEntrySelector>, body: Statement) defined in org.jetbrains.kotlin.j2k.ast.WhenEntry[ClassConstructorDescriptorImpl]

'pendingSelectors' @ [52:42] ==> var pendingSelectors: ArrayList<WhenEntrySelector> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'statement' @ [52:60] ==> val statement: Statement defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'assignNoPrototype' @ [52:71] ==> public fun <TElement : Element> WhenEntry.assignNoPrototype(): WhenEntry defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> WhenEntry

'defaultSelector' @ [53:21] ==> var defaultSelector: WhenEntrySelector? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'defaultEntry' @ [54:21] ==> var defaultEntry: WhenEntry? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'WhenEntry' @ [54:36] ==> public constructor WhenEntry(selectors: List<WhenEntrySelector>, body: Statement) defined in org.jetbrains.kotlin.j2k.ast.WhenEntry[ClassConstructorDescriptorImpl]

'listOf' @ [54:46] ==> public fun <T> listOf(element: WhenEntrySelector): List<WhenEntrySelector> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenEntrySelector

'defaultSelector' @ [54:53] ==> var defaultSelector: WhenEntrySelector? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'statement' @ [54:71] ==> val statement: Statement defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'assignNoPrototype' @ [54:82] ==> public fun <TElement : Element> WhenEntry.assignNoPrototype(): WhenEntry defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> WhenEntry

'pendingSelectors' @ [55:17] ==> var pendingSelectors: ArrayList<WhenEntrySelector> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'ArrayList' @ [55:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WhenEntrySelector

'defaultSelector' @ [56:17] ==> var defaultSelector: WhenEntrySelector? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'defaultEntry' @ [59:9] ==> var defaultEntry: WhenEntry? defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'let' @ [59:23] ==> @InlineOnly public inline fun <T, R> WhenEntry.let(block: (WhenEntry) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenEntry
    <R> -> Boolean

'result' @ [59:27] ==> val result: ArrayList<WhenEntry> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'result' @ [60:16] ==> val result: ArrayList<WhenEntry> defined in org.jetbrains.kotlin.j2k.SwitchConverter.switchBodyToWhenEntries[LocalVariableDescriptor]

'ArrayList' @ [64:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Case

'body' @ [65:13] ==> value-parameter body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[ValueParameterDescriptorImpl]

'ArrayList' @ [67:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiStatement

'currentLabel' @ [70:21] ==> var currentLabel: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'currentCaseStatements' @ [70:45] ==> var currentCaseStatements: ArrayList<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'isNotEmpty' @ [70:67] ==> @InlineOnly public inline fun <T> Collection<PsiStatement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement

'cases' @ [71:21] ==> val cases: ArrayList<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'add' @ [71:27] ==> public open fun add(element: SwitchConverter.Case): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Case' @ [71:31] ==> public constructor Case(label: PsiSwitchLabelStatement?, statements: List<PsiStatement>) defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[ClassConstructorDescriptorImpl]

'currentLabel' @ [71:36] ==> var currentLabel: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'currentCaseStatements' @ [71:50] ==> var currentCaseStatements: ArrayList<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'body' @ [75:31] ==> value-parameter body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[ValueParameterDescriptorImpl]

'statements' @ [75:36] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'if (statement is PsiSwitchLabelStatement) {
                    flushCurrentCase()
                    currentLabel = statement
                    currentCaseStatements = ArrayList()
                }
                else {
                    currentCaseStatements.add(statement)
                }' @ [76:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'statement' @ [76:21] ==> val statement: (PsiStatement..PsiStatement?) defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'flushCurrentCase' @ [77:21] ==> local final fun flushCurrentCase(): Unit defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[SimpleFunctionDescriptorImpl]

'currentLabel' @ [78:21] ==> var currentLabel: PsiSwitchLabelStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'statement' @ [78:36] ==> val statement: (PsiStatement..PsiStatement?) defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'currentCaseStatements' @ [79:21] ==> var currentCaseStatements: ArrayList<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'ArrayList' @ [79:45] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiStatement

'currentCaseStatements' @ [82:21] ==> var currentCaseStatements: ArrayList<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'add' @ [82:43] ==> public open fun add(element: PsiStatement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'statement' @ [82:47] ==> val statement: (PsiStatement..PsiStatement?) defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'flushCurrentCase' @ [86:13] ==> local final fun flushCurrentCase(): Unit defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[SimpleFunctionDescriptorImpl]

'cases' @ [89:16] ==> val cases: ArrayList<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.splitToCases[LocalVariableDescriptor]

'statements' @ [93:32] ==> value-parameter statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'filter' @ [93:43] ==> public inline fun <T> Iterable<PsiStatement>.filter(predicate: (PsiStatement) -> Boolean): List<PsiStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement

'!' @ [93:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSwitchBreak' @ [93:53] ==> private final fun isSwitchBreak(statement: PsiStatement): Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'it' @ [93:67] ==> value-parameter it: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements.<anonymous>[ValueParameterDescriptorImpl]

'allowBlock' @ [94:13] ==> value-parameter allowBlock: Boolean = ... defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'statementsToKeep' @ [94:27] ==> val statementsToKeep: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'size' @ [94:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'statementsToKeep' @ [95:25] ==> val statementsToKeep: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'single' @ [95:42] ==> public fun <T> List<PsiStatement>.single(): PsiStatement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement

'block' @ [96:17] ==> val block: PsiBlockStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'listOf' @ [97:24] ==> public fun <T> listOf(element: Block): List<Block> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Block

'codeConverter' @ [97:31] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.SwitchConverter[PropertyDescriptorImpl]

'convertBlock' @ [97:45] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'block' @ [97:58] ==> val block: PsiBlockStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'codeBlock' @ [97:64] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'!' @ [97:83] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSwitchBreak' @ [97:84] ==> private final fun isSwitchBreak(statement: PsiStatement): Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'it' @ [97:98] ==> value-parameter it: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements.<anonymous>[ValueParameterDescriptorImpl]

'statementsToKeep' @ [100:16] ==> val statementsToKeep: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'map' @ [100:33] ==> public inline fun <T, R> Iterable<PsiStatement>.map(transform: (PsiStatement) -> Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement
    <R> -> Statement

'codeConverter' @ [100:39] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.SwitchConverter[PropertyDescriptorImpl]

'convertStatement' @ [100:53] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'it' @ [100:70] ==> value-parameter it: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements.<anonymous>[ValueParameterDescriptorImpl]

'cases' @ [104:20] ==> value-parameter cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'caseIndex' @ [104:26] ==> value-parameter caseIndex: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'if (caseIndex == cases.lastIndex) {
            false
        }
        else {
            val block = case.statements.singleOrNull() as? PsiBlockStatement
            val statements = block?.codeBlock?.statements?.toList() ?: case.statements
            statements.fallsThrough()
        }' @ [105:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'caseIndex' @ [105:32] ==> value-parameter caseIndex: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'cases' @ [105:45] ==> value-parameter cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'lastIndex' @ [105:51] ==> public val <T> List<SwitchConverter.Case>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Case

'case' @ [109:25] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'statements' @ [109:30] ==> public final val statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'singleOrNull' @ [109:41] ==> public fun <T> List<PsiStatement>.singleOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiStatement

'block' @ [110:30] ==> val block: PsiBlockStatement? defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'codeBlock' @ [110:37] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'statements' @ [110:48] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'toList' @ [110:60] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.toList(): List<(PsiStatement..PsiStatement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'case' @ [110:72] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'statements' @ [110:77] ==> public final val statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'statements' @ [111:13] ==> val statements: List<(PsiStatement..PsiStatement?)> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'fallsThrough' @ [111:24] ==> private final fun List<PsiStatement>.fallsThrough(): Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'if (fallsThrough) // we fall through into the next case
            convertCaseStatements(case.statements, allowBlock = false) + convertCaseStatements(cases, caseIndex + 1, allowBlock = false)
        else
            convertCaseStatements(case.statements, allowBlock)' @ [113:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Statement>, elseBranch: List<Statement>): List<Statement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Statement>

'fallsThrough' @ [113:20] ==> val fallsThrough: Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'convertCaseStatements' @ [114:13] ==> private final fun convertCaseStatements(statements: List<PsiStatement>, allowBlock: Boolean = ...): List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'case' @ [114:35] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'statements' @ [114:40] ==> public final val statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'convertCaseStatements' @ [114:74] ==> private final fun convertCaseStatements(cases: List<SwitchConverter.Case>, caseIndex: Int, allowBlock: Boolean = ...): List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'cases' @ [114:96] ==> value-parameter cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'caseIndex' @ [114:103] ==> value-parameter caseIndex: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'convertCaseStatements' @ [116:13] ==> private final fun convertCaseStatements(statements: List<PsiStatement>, allowBlock: Boolean = ...): List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'case' @ [116:35] ==> val case: SwitchConverter.Case defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[LocalVariableDescriptor]

'statements' @ [116:40] ==> public final val statements: List<PsiStatement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.Case[PropertyDescriptorImpl]

'allowBlock' @ [116:52] ==> value-parameter allowBlock: Boolean = ... defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatements[ValueParameterDescriptorImpl]

'convertCaseStatements' @ [120:26] ==> private final fun convertCaseStatements(cases: List<SwitchConverter.Case>, caseIndex: Int, allowBlock: Boolean = ...): List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'cases' @ [120:48] ==> value-parameter cases: List<SwitchConverter.Case> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatementsToBody[ValueParameterDescriptorImpl]

'caseIndex' @ [120:55] ==> value-parameter caseIndex: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatementsToBody[ValueParameterDescriptorImpl]

'if (statements.size == 1)
            statements.single()
        else
            Block.of(statements).assignNoPrototype()' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statements' @ [121:20] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatementsToBody[LocalVariableDescriptor]

'size' @ [121:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'statements' @ [122:13] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatementsToBody[LocalVariableDescriptor]

'single' @ [122:24] ==> public fun <T> List<Statement>.single(): Statement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'Block' @ [124:13] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'of' @ [124:19] ==> public final fun of(statements: List<Statement>): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'statements' @ [124:22] ==> val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.SwitchConverter.convertCaseStatementsToBody[LocalVariableDescriptor]

'assignNoPrototype' @ [124:34] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'statement' @ [127:58] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.isSwitchBreak[ValueParameterDescriptorImpl]

'statement' @ [127:92] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.isSwitchBreak[ValueParameterDescriptorImpl]

'labelIdentifier' @ [127:102] ==> public final val PsiBreakStatement.labelIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'this' @ [130:27] ==> <this> defined in org.jetbrains.kotlin.j2k.SwitchConverter.fallsThrough[ReceiverParameterDescriptorImpl]

'when (statement) {
                is PsiBreakStatement -> return false
                is PsiContinueStatement -> return false
                is PsiReturnStatement -> return false
                is PsiThrowStatement -> return false
                is PsiSwitchStatement -> if (!statement.canCompleteNormally()) return false
                is PsiIfStatement -> if (!statement.canCompleteNormally()) return false
            }' @ [131:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'statement' @ [131:19] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.fallsThrough[LocalVariableDescriptor]

'!' @ [136:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'statement' @ [136:47] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.fallsThrough[LocalVariableDescriptor]

'canCompleteNormally' @ [136:57] ==> private final fun PsiElement.canCompleteNormally(): Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'!' @ [137:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'statement' @ [137:43] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter.fallsThrough[LocalVariableDescriptor]

'canCompleteNormally' @ [137:53] ==> private final fun PsiElement.canCompleteNormally(): Boolean defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'getInstance' @ [144:46] ==> public open fun getInstance(p0: (Project..Project?)): (ControlFlowFactory..ControlFlowFactory?) defined in com.intellij.psi.controlFlow.ControlFlowFactory[JavaMethodDescriptor]

'project' @ [144:58] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getControlFlow' @ [144:67] ==> @NotNull public open fun getControlFlow(@NotNull p0: PsiElement, @NotNull p1: ControlFlowPolicy): ControlFlow defined in com.intellij.psi.controlFlow.ControlFlowFactory[JavaMethodDescriptor]

'this' @ [144:82] ==> <this> defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[ReceiverParameterDescriptorImpl]

'getInstance' @ [144:130] ==> public open fun getInstance(): (LocalsOrMyInstanceFieldsControlFlowPolicy..LocalsOrMyInstanceFieldsControlFlowPolicy?) defined in com.intellij.psi.controlFlow.LocalsOrMyInstanceFieldsControlFlowPolicy[JavaMethodDescriptor]

'controlFlow' @ [145:27] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'getStartOffset' @ [145:39] ==> public abstract fun getStartOffset(@NotNull p0: PsiElement): Int defined in com.intellij.psi.controlFlow.ControlFlow[JavaMethodDescriptor]

'this' @ [145:54] ==> <this> defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[ReceiverParameterDescriptorImpl]

'controlFlow' @ [146:25] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'getEndOffset' @ [146:37] ==> public abstract fun getEndOffset(@NotNull p0: PsiElement): Int defined in com.intellij.psi.controlFlow.ControlFlow[JavaMethodDescriptor]

'this' @ [146:50] ==> <this> defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[ReceiverParameterDescriptorImpl]

'startOffset' @ [147:16] ==> val startOffset: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'-' @ [147:31] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'endOffset' @ [147:37] ==> val endOffset: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'-' @ [147:50] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'canCompleteNormally' @ [147:72] ==> public open fun canCompleteNormally(p0: (ControlFlow..ControlFlow?), p1: Int, p2: Int): Boolean defined in com.intellij.psi.controlFlow.ControlFlowUtil[JavaMethodDescriptor]

'controlFlow' @ [147:92] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'startOffset' @ [147:105] ==> val startOffset: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

'endOffset' @ [147:118] ==> val endOffset: Int defined in org.jetbrains.kotlin.j2k.SwitchConverter.canCompleteNormally[LocalVariableDescriptor]

