'KotlinQuickFixAction<KtLabelReferenceExpression>' @ [31:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtLabelReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtLabelReferenceExpression

'expression' @ [31:54] ==> value-parameter expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.<init>[ValueParameterDescriptorImpl]

'CreateLabelFix' @ [32:61] ==> private constructor CreateLabelFix(expression: KtLabelReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[ClassConstructorDescriptorImpl]

'expression' @ [32:76] ==> value-parameter expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLoop.<init>[ValueParameterDescriptorImpl]

'labelReferenceExpression' @ [36:17] ==> value-parameter labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLoop.getCandidateExpressions[ValueParameterDescriptorImpl]

'getContainingLoops' @ [36:42] ==> private final fun KtLabelReferenceExpression.getContainingLoops(): Sequence<KtLoopExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion[SimpleFunctionDescriptorImpl]

'toList' @ [36:63] ==> public fun <T> Sequence<KtLoopExpression>.toList(): List<KtLoopExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLoopExpression

'CreateLabelFix' @ [39:63] ==> private constructor CreateLabelFix(expression: KtLabelReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[ClassConstructorDescriptorImpl]

'expression' @ [39:78] ==> value-parameter expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLambda.<init>[ValueParameterDescriptorImpl]

'labelReferenceExpression' @ [43:17] ==> value-parameter labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLambda.getCandidateExpressions[ValueParameterDescriptorImpl]

'getContainingLambdas' @ [43:42] ==> private final fun KtLabelReferenceExpression.getContainingLambdas(): Sequence<KtLambdaExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion[SimpleFunctionDescriptorImpl]

'toList' @ [43:65] ==> public fun <T> Sequence<KtLambdaExpression>.toList(): List<KtLambdaExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'element' @ [48:46] ==> protected final val element: KtLabelReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[PropertyDescriptorImpl]

'getReferencedName' @ [48:55] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtLabelReferenceExpression[DeserializedSimpleFunctionDescriptor]

'project' @ [57:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.doCreateLabel[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [57:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [57:37] ==> public final val CreateLabelFix.text: String[MyPropertyDescriptor]

'it' @ [58:13] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.doCreateLabel[ValueParameterDescriptorImpl]

'replace' @ [58:16] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [58:24] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [58:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.doCreateLabel[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [58:46] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [58:75] ==> value-parameter expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.doCreateLabel[ValueParameterDescriptorImpl]

'getReferencedName' @ [58:86] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtLabelReferenceExpression[DeserializedSimpleFunctionDescriptor]

'it' @ [58:113] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.doCreateLabel[ValueParameterDescriptorImpl]

'element' @ [63:26] ==> protected final val element: KtLabelReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[PropertyDescriptorImpl]

'editor' @ [64:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[ValueParameterDescriptorImpl]

'getCandidateExpressions' @ [66:26] ==> public abstract fun getCandidateExpressions(labelReferenceExpression: KtLabelReferenceExpression): List<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[SimpleFunctionDescriptorImpl]

'expression' @ [66:50] ==> val expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[LocalVariableDescriptor]

'getApplication' @ [68:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [68:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'doCreateLabel' @ [69:20] ==> private final fun doCreateLabel(expression: KtLabelReferenceExpression, it: KtExpression, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[SimpleFunctionDescriptorImpl]

'expression' @ [69:34] ==> val expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[LocalVariableDescriptor]

'containers' @ [69:46] ==> val containers: List<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[LocalVariableDescriptor]

'last' @ [69:57] ==> public fun <T> List<KtExpression>.last(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'project' @ [69:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[ValueParameterDescriptorImpl]

'chooseContainerElementIfNecessary' @ [72:9] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<KtExpression>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (KtExpression) -> PsiElement, onSelect: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtExpression

'containers' @ [73:17] ==> val containers: List<KtExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[LocalVariableDescriptor]

'editor' @ [74:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[ValueParameterDescriptorImpl]

'chooserTitle' @ [75:17] ==> public abstract val chooserTitle: String defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[PropertyDescriptorImpl]

'it' @ [77:19] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'doCreateLabel' @ [79:21] ==> private final fun doCreateLabel(expression: KtLabelReferenceExpression, it: KtExpression, project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix[SimpleFunctionDescriptorImpl]

'expression' @ [79:35] ==> val expression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[LocalVariableDescriptor]

'it' @ [79:47] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [79:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.invoke[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [84:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'parents' @ [86:20] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [87:22] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [87:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [87:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLoops.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [87:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLoops.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [87:88] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLoops.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [88:22] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtLoopExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtLoopExpression

'parents' @ [92:20] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [93:22] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'!' @ [93:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [93:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLambdas.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [93:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLambdas.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [93:95] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLambdas.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [93:116] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.getContainingLambdas.<anonymous>[ValueParameterDescriptorImpl]

'filterIsInstance' @ [94:22] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtLambdaExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtLambdaExpression

'diagnostic' @ [98:44] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [98:55] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'labelReferenceExpression' @ [99:37] ==> val labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

'parent' @ [99:62] ==> public final val KtLabelReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [99:91] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parentExpression) {
                is KtBreakExpression, is KtContinueExpression -> {
                    if (labelReferenceExpression.getContainingLoops().any()) CreateLabelFix.ForLoop(labelReferenceExpression) else null
                }
                is KtReturnExpression -> {
                    if (labelReferenceExpression.getContainingLambdas().any()) CreateLabelFix.ForLambda(labelReferenceExpression) else null
                }
                else -> null
            }' @ [100:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntentionAction?, entry1: IntentionAction?, entry2: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntentionAction?

'parentExpression' @ [100:26] ==> val parentExpression: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

'if (labelReferenceExpression.getContainingLoops().any()) CreateLabelFix.ForLoop(labelReferenceExpression) else null' @ [102:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CreateLabelFix.ForLoop?, elseBranch: CreateLabelFix.ForLoop?): CreateLabelFix.ForLoop?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ForLoop?

'labelReferenceExpression' @ [102:25] ==> val labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

'getContainingLoops' @ [102:50] ==> private final fun KtLabelReferenceExpression.getContainingLoops(): Sequence<KtLoopExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion[SimpleFunctionDescriptorImpl]

'any' @ [102:71] ==> public fun <T> Sequence<KtLoopExpression>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLoopExpression

'ForLoop' @ [102:93] ==> public constructor ForLoop(expression: KtLabelReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLoop[ClassConstructorDescriptorImpl]

'labelReferenceExpression' @ [102:101] ==> val labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

'if (labelReferenceExpression.getContainingLambdas().any()) CreateLabelFix.ForLambda(labelReferenceExpression) else null' @ [105:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CreateLabelFix.ForLambda?, elseBranch: CreateLabelFix.ForLambda?): CreateLabelFix.ForLambda?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ForLambda?

'labelReferenceExpression' @ [105:25] ==> val labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

'getContainingLambdas' @ [105:50] ==> private final fun KtLabelReferenceExpression.getContainingLambdas(): Sequence<KtLambdaExpression> defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion[SimpleFunctionDescriptorImpl]

'any' @ [105:73] ==> public fun <T> Sequence<KtLambdaExpression>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'ForLambda' @ [105:95] ==> public constructor ForLambda(expression: KtLabelReferenceExpression) defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.ForLambda[ClassConstructorDescriptorImpl]

'labelReferenceExpression' @ [105:105] ==> val labelReferenceExpression: KtLabelReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.CreateLabelFix.Companion.createAction[LocalVariableDescriptor]

