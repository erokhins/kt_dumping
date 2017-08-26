'KotlinQuickFixAction<KtExpression>' @ [39:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [39:40] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'run' @ [40:50] ==> @InlineOnly public inline fun <T, R> NumberConversionFix.run(block: NumberConversionFix.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NumberConversionFix
    <R> -> Boolean

'element' @ [41:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'analyze' @ [41:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [41:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [41:71] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'element' @ [41:79] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'expressionType' @ [42:9] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isConversionAvailable.<anonymous>[LocalVariableDescriptor]

'expressionType' @ [42:35] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isConversionAvailable.<anonymous>[LocalVariableDescriptor]

'type' @ [42:53] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'expressionType' @ [42:61] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isConversionAvailable.<anonymous>[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [42:76] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [42:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'isPrimitiveNumberType' @ [42:108] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [44:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [44:59] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [44:92] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [44:103] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.<init>[ValueParameterDescriptorImpl]

'disableIfAvailable' @ [47:15] ==> private final val disableIfAvailable: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[PropertyDescriptorImpl]

'isAvailable' @ [47:35] ==> public abstract fun isAvailable(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?)): Boolean defined in com.intellij.codeInsight.intention.IntentionAction[JavaMethodDescriptor]

'project' @ [47:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [47:56] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [47:64] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'isConversionAvailable' @ [48:18] ==> private final val isConversionAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[PropertyDescriptorImpl]

'super' @ [49:18] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [49:24] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [49:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [49:45] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [49:53] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.isAvailable[ValueParameterDescriptorImpl]

'typePresentation' @ [52:55] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[PropertyDescriptorImpl]

'element' @ [55:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [56:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [56:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [56:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [56:92] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[LocalVariableDescriptor]

'typePresentation' @ [56:101] ==> private final val typePresentation: String defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix[PropertyDescriptorImpl]

'element' @ [57:29] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[LocalVariableDescriptor]

'replaced' @ [57:37] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expressionToInsert' @ [57:46] ==> val expressionToInsert: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[LocalVariableDescriptor]

'editor' @ [58:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [58:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [58:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newExpression' @ [58:42] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.NumberConversionFix.invoke[LocalVariableDescriptor]

'endOffset' @ [58:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

