'SelfTargetingIntention<KtIfExpression>' @ [36:36] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'KtIfExpression' @ [36:75] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [36:97] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'!' @ [38:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [38:14] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'ifKeyword' @ [38:22] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [38:32] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [38:42] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [38:57] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [39:16] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'condition' @ [39:24] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'element' @ [39:45] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'then' @ [39:53] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'parentBlockRBrace' @ [43:22] ==> private final fun parentBlockRBrace(element: KtIfExpression): PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'element' @ [43:40] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'if (rBrace != null)
            PsiChildRange(element, rBrace)
        else
            PsiChildRange.singleElement(element)' @ [44:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiChildRange, elseBranch: PsiChildRange): PsiChildRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiChildRange

'rBrace' @ [44:38] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [45:13] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'element' @ [45:27] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'rBrace' @ [45:36] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [47:13] ==> public companion object defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[FakeCallableDescriptorForObject]

'singleElement' @ [47:27] ==> public final fun singleElement(element: PsiElement): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange.Companion[DeserializedSimpleFunctionDescriptor]

'element' @ [47:41] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'CommentSaver' @ [48:28] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'commentSavingRange' @ [48:41] ==> val commentSavingRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'element' @ [50:28] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'condition' @ [50:36] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'negate' @ [50:48] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'handleSpecialCases' @ [52:21] ==> private final fun handleSpecialCases(ifExpression: KtIfExpression, newCondition: KtExpression): KtIfExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'element' @ [52:40] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'newCondition' @ [52:49] ==> val newCondition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'handleStandardCase' @ [53:24] ==> private final fun handleStandardCase(ifExpression: KtIfExpression, newCondition: KtExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'element' @ [53:43] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'newCondition' @ [53:52] ==> val newCondition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'if (rBrace != null)
            PsiChildRange(newIf, rBrace)
        else
            PsiChildRange(newIf, parentBlockRBrace(newIf) ?: newIf)' @ [55:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiChildRange, elseBranch: PsiChildRange): PsiChildRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiChildRange

'rBrace' @ [55:39] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [56:13] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'newIf' @ [56:27] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'rBrace' @ [56:34] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'PsiChildRange' @ [58:13] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'newIf' @ [58:27] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'parentBlockRBrace' @ [58:34] ==> private final fun parentBlockRBrace(element: KtIfExpression): PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'newIf' @ [58:52] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'newIf' @ [58:62] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [59:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'restore' @ [59:22] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'commentRestoreRange' @ [59:30] ==> val commentRestoreRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'newIf' @ [61:30] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'condition' @ [61:36] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'ConvertBinaryExpressionWithDemorgansLawIntention' @ [62:33] ==> public constructor ConvertBinaryExpressionWithDemorgansLawIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[ClassConstructorDescriptorImpl]

'newIfCondition' @ [63:10] ==> val newIfCondition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'let' @ [63:50] ==> @InlineOnly public inline fun <T, R> KtPrefixExpression.let(block: (KtPrefixExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPrefixExpression
    <R> -> Unit

'it' @ [65:17] ==> value-parameter it: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'operationReference' @ [65:20] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [65:39] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'EXCL' @ [65:82] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [66:35] ==> value-parameter it: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'baseExpression' @ [66:38] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [66:85] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'binaryExpr' @ [67:21] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'simplifyIntention' @ [67:43] ==> val simplifyIntention: ConvertBinaryExpressionWithDemorgansLawIntention defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'isApplicableTo' @ [67:61] ==> public open fun isApplicableTo(element: KtBinaryExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[SimpleFunctionDescriptorImpl]

'binaryExpr' @ [67:76] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'simplifyIntention' @ [68:21] ==> val simplifyIntention: ConvertBinaryExpressionWithDemorgansLawIntention defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'applyTo' @ [68:39] ==> public final fun applyTo(element: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[SimpleFunctionDescriptorImpl]

'binaryExpr' @ [68:47] ==> val binaryExpr: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'editor' @ [73:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[ValueParameterDescriptorImpl]

'apply' @ [73:17] ==> @InlineOnly public inline fun <T> Editor.apply(block: Editor.() -> Unit): Editor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor

'unblockDocument' @ [74:13] ==> public fun Editor.unblockDocument(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'moveCaret' @ [75:13] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newIf' @ [75:23] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.applyTo[LocalVariableDescriptor]

'textOffset' @ [75:29] ==> public final val KtIfExpression.textOffset: Int[MyPropertyDescriptor]

'KtPsiFactory' @ [80:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [80:39] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[ValueParameterDescriptorImpl]

'ifExpression' @ [82:26] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[ValueParameterDescriptorImpl]

'then' @ [82:39] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [83:26] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[ValueParameterDescriptorImpl]

'`else`' @ [83:39] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'psiFactory' @ [83:49] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'createEmptyBody' @ [83:60] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'if (elseBranch is KtIfExpression)
            psiFactory.createSingleStatementBlock(elseBranch)
        else
            elseBranch' @ [85:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'elseBranch' @ [85:27] ==> val elseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'psiFactory' @ [86:13] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'createSingleStatementBlock' @ [86:24] ==> public final fun createSingleStatementBlock(statement: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'elseBranch' @ [86:51] ==> val elseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'elseBranch' @ [88:13] ==> val elseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'if (thenBranch is KtBlockExpression && thenBranch.statements.isEmpty())
            null
        else
            thenBranch' @ [90:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'thenBranch' @ [90:27] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'thenBranch' @ [90:62] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'statements' @ [90:73] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'isEmpty' @ [90:84] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'thenBranch' @ [93:13] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'ifExpression' @ [95:16] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[ValueParameterDescriptorImpl]

'replaced' @ [95:29] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtIfExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtIfExpression

'psiFactory' @ [95:38] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'createIf' @ [95:49] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newCondition' @ [95:58] ==> value-parameter newCondition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[ValueParameterDescriptorImpl]

'newThen' @ [95:72] ==> val newThen: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'newElse' @ [95:81] ==> val newElse: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleStandardCase[LocalVariableDescriptor]

'ifExpression' @ [99:26] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'`else`' @ [99:39] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'elseBranch' @ [100:13] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'KtPsiFactory' @ [102:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [102:36] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'ifExpression' @ [104:26] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'then' @ [104:39] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'thenBranch' @ [105:33] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'lastBlockStatementOrThis' @ [105:44] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'lastThenStatement' @ [106:13] ==> val lastThenStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'isExitStatement' @ [106:31] ==> public fun KtExpression.isExitStatement(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'ifExpression' @ [107:25] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'parent' @ [107:38] ==> public final val KtIfExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'block' @ [108:17] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'block' @ [109:30] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'rBrace' @ [109:36] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'ifExpression' @ [110:38] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'siblings' @ [110:51] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'takeWhile' @ [111:26] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [111:38] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases.<anonymous>[ValueParameterDescriptorImpl]

'rBrace' @ [111:44] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'toList' @ [112:26] ==> public fun <T> Sequence<PsiElement>.toList(): List<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'afterIfInBlock' @ [113:44] ==> val afterIfInBlock: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'lastIsInstanceOrNull' @ [113:59] ==> public inline fun <reified T : Any> Iterable<*>.lastIsInstanceOrNull(): KtExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtExpression

'lastStatementInBlock' @ [114:21] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'if (lastStatementInBlock.isExitStatement())
                        lastStatementInBlock
                    else
                        exitStatementExecutedAfter(lastStatementInBlock)' @ [115:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'lastStatementInBlock' @ [115:52] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'isExitStatement' @ [115:73] ==> public fun KtExpression.isExitStatement(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'lastStatementInBlock' @ [116:25] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'exitStatementExecutedAfter' @ [118:25] ==> private final fun exitStatementExecutedAfter(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'lastStatementInBlock' @ [118:52] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'exitStatementAfterIf' @ [119:25] ==> val exitStatementAfterIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'afterIfInBlock' @ [120:37] ==> val afterIfInBlock: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'first' @ [120:52] ==> public fun <T> List<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'afterIfInBlock' @ [121:36] ==> val afterIfInBlock: List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'last' @ [121:51] ==> public fun <T> List<PsiElement>.last(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'if (isEmptyReturn(lastThenStatement) && isEmptyReturn(lastStatementInBlock)) {
                            PsiChildRange(first, lastStatementInBlock.prevSibling).trimWhiteSpaces()
                        }
                        else {
                            PsiChildRange(first, last).trimWhiteSpaces()
                        }' @ [124:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiChildRange, elseBranch: PsiChildRange): PsiChildRange[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiChildRange

'isEmptyReturn' @ [124:48] ==> private final fun isEmptyReturn(statement: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'lastThenStatement' @ [124:62] ==> val lastThenStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'isEmptyReturn' @ [124:84] ==> private final fun isEmptyReturn(statement: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'lastStatementInBlock' @ [124:98] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'PsiChildRange' @ [125:29] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'first' @ [125:43] ==> val first: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'lastStatementInBlock' @ [125:50] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'prevSibling' @ [125:71] ==> public final val KtExpression.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'trimWhiteSpaces' @ [125:84] ==> public fun PsiChildRange.trimWhiteSpaces(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'PsiChildRange' @ [128:29] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'first' @ [128:43] ==> val first: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'last' @ [128:50] ==> val last: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'trimWhiteSpaces' @ [128:56] ==> public fun PsiChildRange.trimWhiteSpaces(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'factory' @ [130:37] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'createExpressionByPattern' @ [130:45] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newCondition' @ [130:89] ==> value-parameter newCondition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'newThenRange' @ [130:103] ==> val newThenRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'block' @ [133:25] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'deleteChildRange' @ [133:31] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'first' @ [133:48] ==> val first: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'last' @ [133:55] ==> val last: PsiElement defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'isEmptyReturn' @ [135:29] ==> private final fun isEmptyReturn(statement: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'lastThenStatement' @ [135:43] ==> val lastThenStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'block' @ [136:33] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'parent' @ [136:39] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'block' @ [136:74] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'parent' @ [136:80] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'lastThenStatement' @ [137:33] ==> val lastThenStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'delete' @ [137:51] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'copyThenBranchAfter' @ [140:41] ==> private final fun copyThenBranchAfter(ifExpression: KtIfExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'ifExpression' @ [140:61] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'exitStatementAfterIf' @ [143:29] ==> val exitStatementAfterIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'lastStatementInBlock' @ [143:53] ==> val lastStatementInBlock: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'exitStatementExecutedAfter' @ [145:50] ==> private final fun exitStatementExecutedAfter(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'updatedIf' @ [145:77] ==> val updatedIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'exitAfterNewIf' @ [146:33] ==> val exitAfterNewIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'!' @ [146:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exitAfterNewIf' @ [146:60] ==> val exitAfterNewIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'matches' @ [146:75] ==> public fun PsiElement?.matches(e: PsiElement?): Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'exitStatementAfterIf' @ [146:83] ==> val exitStatementAfterIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'newIf' @ [147:47] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'then' @ [147:53] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'newThen' @ [148:33] ==> val newThen: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'addBefore' @ [148:41] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'exitStatementAfterIf' @ [148:51] ==> val exitStatementAfterIf: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'newThen' @ [148:73] ==> val newThen: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'rBrace' @ [148:81] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'updatedIf' @ [152:32] ==> val updatedIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'replace' @ [152:42] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIfExpression[DeserializedSimpleFunctionDescriptor]

'newIf' @ [152:50] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'exitStatementExecutedAfter' @ [159:29] ==> private final fun exitStatementExecutedAfter(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'ifExpression' @ [159:56] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'copyThenBranchAfter' @ [161:25] ==> private final fun copyThenBranchAfter(ifExpression: KtIfExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'ifExpression' @ [161:45] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'factory' @ [162:21] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'createExpressionByPattern' @ [162:29] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newCondition' @ [162:69] ==> value-parameter newCondition: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[ValueParameterDescriptorImpl]

'exitStatement' @ [162:83] ==> val exitStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'updatedIf' @ [163:16] ==> val updatedIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'replace' @ [163:26] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIfExpression[DeserializedSimpleFunctionDescriptor]

'newIf' @ [163:34] ==> val newIf: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.handleSpecialCases[LocalVariableDescriptor]

'statement' @ [167:13] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isEmptyReturn[ValueParameterDescriptorImpl]

'statement' @ [167:48] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isEmptyReturn[ValueParameterDescriptorImpl]

'returnedExpression' @ [167:58] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'statement' @ [167:88] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.isEmptyReturn[ValueParameterDescriptorImpl]

'labeledExpression' @ [167:98] ==> public final val KtReturnExpression.labeledExpression: PsiElement?[MyPropertyDescriptor]

'KtPsiFactory' @ [170:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [170:36] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'ifExpression' @ [171:26] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'then' @ [171:39] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [171:54] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'ifExpression' @ [173:22] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'parent' @ [173:35] ==> public final val KtIfExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [174:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'assert' @ [175:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parent' @ [175:20] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'factory' @ [176:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'createEmptyBody' @ [176:33] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'block' @ [177:13] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'addAfter' @ [177:19] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'ifExpression' @ [177:28] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'block' @ [177:42] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'lBrace' @ [177:48] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'ifExpression' @ [178:28] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'replaced' @ [178:41] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtBlockExpression): KtBlockExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBlockExpression

'block' @ [178:50] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'newBlock' @ [179:25] ==> val newBlock: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'statements' @ [179:34] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [179:45] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'copyThenBranchAfter' @ [180:20] ==> private final fun copyThenBranchAfter(ifExpression: KtIfExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'newIf' @ [180:40] ==> val newIf: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'if (thenBranch is KtBlockExpression) {
            val range = thenBranch.contentRange()
            if (!range.isEmpty) {
                parent.addRangeAfter(range.first, range.last, ifExpression)
                parent.addAfter(factory.createNewLine(), ifExpression)
            }
        }
        else {
            parent.addAfter(thenBranch, ifExpression)
            parent.addAfter(factory.createNewLine(), ifExpression)
        }' @ [183:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'thenBranch' @ [183:13] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'thenBranch' @ [184:25] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'contentRange' @ [184:36] ==> public fun KtBlockExpression.contentRange(): PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [185:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'range' @ [185:18] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'isEmpty' @ [185:24] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'parent' @ [186:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'addRangeAfter' @ [186:24] ==> public abstract fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'range' @ [186:38] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'first' @ [186:44] ==> public final val first: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'range' @ [186:51] ==> val range: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'last' @ [186:57] ==> public final val last: PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedPropertyDescriptor]

'ifExpression' @ [186:63] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'parent' @ [187:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'addAfter' @ [187:24] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'factory' @ [187:33] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'createNewLine' @ [187:41] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [187:58] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'parent' @ [191:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'addAfter' @ [191:20] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'thenBranch' @ [191:29] ==> val thenBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'ifExpression' @ [191:41] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'parent' @ [192:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'addAfter' @ [192:20] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'factory' @ [192:29] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[LocalVariableDescriptor]

'createNewLine' @ [192:37] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [192:54] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'ifExpression' @ [194:16] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.copyThenBranchAfter[ValueParameterDescriptorImpl]

'expression' @ [198:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'parent' @ [198:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [199:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'parent' @ [200:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'statements' @ [200:40] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'last' @ [200:51] ==> public fun <T> List<(KtExpression..KtExpression?)>.last(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'if (expression == lastStatement) {
                return exitStatementExecutedAfter(parent)
            }
            else {
                if (lastStatement.isExitStatement() && expression.siblings(withItself = false).firstIsInstance<KtExpression>() == lastStatement) {
                    return lastStatement
                }
                return null
            }' @ [201:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'expression' @ [201:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'lastStatement' @ [201:31] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'exitStatementExecutedAfter' @ [202:24] ==> private final fun exitStatementExecutedAfter(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'parent' @ [202:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'lastStatement' @ [205:21] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'isExitStatement' @ [205:35] ==> public fun KtExpression.isExitStatement(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [205:56] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'siblings' @ [205:67] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstance' @ [205:96] ==> public inline fun <reified T> Sequence<*>.firstIsInstance(): KtExpression defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtExpression

'lastStatement' @ [205:131] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'lastStatement' @ [206:28] ==> val lastStatement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'when (parent) {
            is KtNamedFunction -> {
                if (parent.bodyExpression == expression) {
                    if (!parent.hasBlockBody()) return null
                    val returnType = (parent.resolveToDescriptor(BodyResolveMode.PARTIAL) as FunctionDescriptor).returnType
                    if (returnType == null || !returnType.isUnit()) return null
                    return KtPsiFactory(expression).createExpression("return")
                }
            }

            is KtContainerNode -> {
                val pparent = parent.parent
                when (pparent) {
                    is KtLoopExpression -> {
                        if (expression == pparent.body) {
                            return KtPsiFactory(expression).createExpression("continue")
                        }
                    }

                    is KtIfExpression -> {
                        if (expression == pparent.then || expression == pparent.`else`) {
                            return exitStatementExecutedAfter(pparent)
                        }
                    }
                }
            }
        }' @ [212:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [212:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'parent' @ [214:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'bodyExpression' @ [214:28] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [214:46] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'!' @ [215:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [215:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'hasBlockBody' @ [215:33] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'parent' @ [216:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'resolveToDescriptor' @ [216:46] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [216:82] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'returnType' @ [216:114] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [217:25] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'!' @ [217:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [217:48] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'isUnit' @ [217:59] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [218:28] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [218:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'createExpression' @ [218:53] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parent' @ [223:31] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'parent' @ [223:38] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (pparent) {
                    is KtLoopExpression -> {
                        if (expression == pparent.body) {
                            return KtPsiFactory(expression).createExpression("continue")
                        }
                    }

                    is KtIfExpression -> {
                        if (expression == pparent.then || expression == pparent.`else`) {
                            return exitStatementExecutedAfter(pparent)
                        }
                    }
                }' @ [224:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'pparent' @ [224:23] ==> val pparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'expression' @ [226:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'pparent' @ [226:43] ==> val pparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'body' @ [226:51] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [227:36] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [227:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'createExpression' @ [227:61] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [232:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'pparent' @ [232:43] ==> val pparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'then' @ [232:51] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'expression' @ [232:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[ValueParameterDescriptorImpl]

'pparent' @ [232:73] ==> val pparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'`else`' @ [232:81] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'exitStatementExecutedAfter' @ [233:36] ==> private final fun exitStatementExecutedAfter(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention[SimpleFunctionDescriptorImpl]

'pparent' @ [233:63] ==> val pparent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.exitStatementExecutedAfter[LocalVariableDescriptor]

'element' @ [243:17] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.InvertIfConditionIntention.parentBlockRBrace[ValueParameterDescriptorImpl]

'parent' @ [243:25] ==> public final val KtIfExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'rBrace' @ [243:56] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

