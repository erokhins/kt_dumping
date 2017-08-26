'KotlinQuickFixAction<KtLoopExpression>' @ [31:4] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtLoopExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtLoopExpression

'loop' @ [31:43] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.<init>[ValueParameterDescriptorImpl]

'loop' @ [33:38] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.<init>[ValueParameterDescriptorImpl]

'parent' @ [33:43] ==> public final val KtLoopExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getLabelName' @ [33:76] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'if (existingLabelName != null) "Add '@$existingLabelName' to ${jumpExpression.text}"
            else "Add label to loop"' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'existingLabelName' @ [36:17] ==> private final val existingLabelName: String? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'existingLabelName' @ [36:52] ==> private final val existingLabelName: String? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'jumpExpression' @ [36:76] ==> private final val jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'text' @ [36:91] ==> public final val KtExpressionWithLabel.text: (String..String?)[MyPropertyDescriptor]

'description' @ [39:30] ==> private final val description: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'text' @ [40:36] ==> public final val AddLoopLabelFix.text: String[MyPropertyDescriptor]

'super' @ [43:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [43:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [43:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [43:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [43:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [47:23] ==> protected final val element: KtLoopExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'existingLabelName' @ [48:25] ==> private final val existingLabelName: String? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'getUniqueLabelName' @ [48:46] ==> private final fun getUniqueLabelName(existingNames: Collection<String>): String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[SimpleFunctionDescriptorImpl]

'collectUsedLabels' @ [48:65] ==> private final fun collectUsedLabels(element: KtElement): Set<String> defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[SimpleFunctionDescriptorImpl]

'element' @ [48:83] ==> val element: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'KtPsiFactory' @ [50:29] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [50:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [50:51] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'jumpExpression' @ [50:68] ==> private final val jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'text' @ [50:83] ==> public final val KtExpressionWithLabel.text: (String..String?)[MyPropertyDescriptor]

'labelName' @ [50:96] ==> val labelName: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'jumpExpression' @ [51:9] ==> private final val jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'replace' @ [51:24] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[DeserializedSimpleFunctionDescriptor]

'jumpWithLabel' @ [51:32] ==> val jumpWithLabel: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'existingLabelName' @ [54:13] ==> private final val existingLabelName: String? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [55:41] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [55:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[ValueParameterDescriptorImpl]

'createLabeledExpression' @ [55:63] ==> public final fun createLabeledExpression(labelName: String): KtLabeledExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'labelName' @ [55:87] ==> val labelName: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'labeledLoopExpression' @ [56:13] ==> val labeledLoopExpression: KtLabeledExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'baseExpression' @ [56:35] ==> public final val baseExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedPropertyDescriptor]

'replace' @ [56:52] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'element' @ [56:60] ==> val element: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'element' @ [57:13] ==> val element: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'replace' @ [57:21] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtLoopExpression[DeserializedSimpleFunctionDescriptor]

'labeledLoopExpression' @ [57:29] ==> val labeledLoopExpression: KtLabeledExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.invoke[LocalVariableDescriptor]

'hashSetOf' @ [64:26] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [65:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels[ValueParameterDescriptorImpl]

'acceptChildren' @ [65:17] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [65:41] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [67:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLabeledExpression' @ [67:23] ==> public open fun visitLabeledExpression(@NotNull p0: KtLabeledExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [67:46] ==> value-parameter expression: KtLabeledExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels.<no name provided>.visitLabeledExpression[ValueParameterDescriptorImpl]

'usedLabels' @ [68:17] ==> val usedLabels: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels[LocalVariableDescriptor]

'add' @ [68:28] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'expression' @ [68:32] ==> value-parameter expression: KtLabeledExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels.<no name provided>.visitLabeledExpression[ValueParameterDescriptorImpl]

'getLabelName' @ [68:43] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [71:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels[ValueParameterDescriptorImpl]

'parents' @ [71:17] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'forEach' @ [71:25] ==> public inline fun <T> Sequence<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [72:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels.<anonymous>[ValueParameterDescriptorImpl]

'usedLabels' @ [73:17] ==> val usedLabels: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels[LocalVariableDescriptor]

'add' @ [73:28] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [73:32] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels.<anonymous>[ValueParameterDescriptorImpl]

'getLabelName' @ [73:35] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'usedLabels' @ [76:16] ==> val usedLabels: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.collectUsedLabels[LocalVariableDescriptor]

'result' @ [82:16] ==> var result: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.getUniqueLabelName[LocalVariableDescriptor]

'existingNames' @ [82:26] ==> value-parameter existingNames: Collection<String> defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.getUniqueLabelName[ValueParameterDescriptorImpl]

'result' @ [83:13] ==> var result: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.getUniqueLabelName[LocalVariableDescriptor]

'++' @ [83:29] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [83:31] ==> var index: Int defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.getUniqueLabelName[LocalVariableDescriptor]

'result' @ [85:16] ==> var result: String defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.getUniqueLabelName[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [88:23] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [90:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [90:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'assert' @ [91:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [91:20] ==> val element: KtExpressionWithLabel? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

'element' @ [91:52] ==> val element: KtExpressionWithLabel? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

'assert' @ [92:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [92:20] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [92:21] ==> val element: KtExpressionWithLabel? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

'getLabelName' @ [92:55] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [93:24] ==> val element: KtExpressionWithLabel? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [93:33] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtLoopExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLoopExpression

'AddLoopLabelFix' @ [94:20] ==> public constructor AddLoopLabelFix(loop: KtLoopExpression, jumpExpression: KtExpressionWithLabel) defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix[ClassConstructorDescriptorImpl]

'loop' @ [94:36] ==> val loop: KtLoopExpression defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

'element' @ [94:42] ==> val element: KtExpressionWithLabel? defined in org.jetbrains.kotlin.idea.quickfix.AddLoopLabelFix.Companion.createAction[LocalVariableDescriptor]

