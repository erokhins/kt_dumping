'DeprecatedSymbolUsageFixBase' @ [37:5] ==> public constructor DeprecatedSymbolUsageFixBase(element: KtSimpleNameExpression, replaceWith: ReplaceWith) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[ClassConstructorDescriptorImpl]

'element' @ [37:34] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.<init>[ValueParameterDescriptorImpl]

'replaceWith' @ [37:43] ==> value-parameter replaceWith: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.<init>[ValueParameterDescriptorImpl]

'text' @ [41:30] ==> private final val text: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[PropertyDescriptorImpl]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [46:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [46:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase[SimpleFunctionDescriptorImpl]

'project' @ [46:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [46:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [46:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.isAvailable[ValueParameterDescriptorImpl]

'targetPsiElement' @ [47:16] ==> private final fun targetPsiElement(): KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[SimpleFunctionDescriptorImpl]

'targetPsiElement' @ [51:26] ==> private final fun targetPsiElement(): KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[SimpleFunctionDescriptorImpl]

'replacementStrategy' @ [52:9] ==> value-parameter replacementStrategy: UsageReplacementStrategy defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.invoke[ValueParameterDescriptorImpl]

'replaceUsagesInWholeProject' @ [52:29] ==> public fun UsageReplacementStrategy.replaceUsagesInWholeProject(targetPsiElement: PsiElement, progressTitle: String, commandName: String, postAction: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.codeInliner in file UsageReplacementStrategy.kt[SimpleFunctionDescriptorImpl]

'psiElement' @ [52:57] ==> val psiElement: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.invoke[LocalVariableDescriptor]

'text' @ [52:97] ==> private final val text: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[PropertyDescriptorImpl]

'text' @ [52:119] ==> private final val text: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[PropertyDescriptorImpl]

'element' @ [56:31] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[PropertyDescriptorImpl]

'mainReference' @ [56:40] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [56:55] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'when (referenceTarget) {
            is KtNamedFunction -> referenceTarget
            is KtProperty -> referenceTarget
            is KtTypeAlias -> referenceTarget
            is KtConstructor<*> -> referenceTarget.getContainingClassOrObject() //TODO: constructor can be deprecated itself
            else -> null
        }' @ [57:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtDeclaration?, entry1: KtDeclaration?, entry2: KtDeclaration?, entry3: KtDeclaration?, entry4: KtDeclaration?): KtDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtDeclaration?

'referenceTarget' @ [57:22] ==> val referenceTarget: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.targetPsiElement[LocalVariableDescriptor]

'referenceTarget' @ [58:35] ==> val referenceTarget: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.targetPsiElement[LocalVariableDescriptor]

'referenceTarget' @ [59:30] ==> val referenceTarget: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.targetPsiElement[LocalVariableDescriptor]

'referenceTarget' @ [60:31] ==> val referenceTarget: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.targetPsiElement[LocalVariableDescriptor]

'referenceTarget' @ [61:36] ==> val referenceTarget: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.targetPsiElement[LocalVariableDescriptor]

'getContainingClassOrObject' @ [61:52] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [66:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'DescriptorRenderer' @ [68:32] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [68:51] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [69:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [69:25] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'classifierNamePolicy' @ [70:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'SHORT' @ [70:57] ==> public object SHORT : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'parameterNameRenderingPolicy' @ [71:13] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [71:73] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'receiverAfterName' @ [72:13] ==> public abstract var receiverAfterName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'renderCompanionObjectName' @ [73:13] ==> public abstract var renderCompanionObjectName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'withoutSuperTypes' @ [74:13] ==> public abstract var withoutSuperTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'startFromName' @ [75:13] ==> public abstract var startFromName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'withDefinedIn' @ [76:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'component1' @ [80:18] ==> public final operator fun component1(): KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]

'component2' @ [80:34] ==> public final operator fun component2(): ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]

'component3' @ [80:47] ==> public final operator fun component3(): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]

'?:' @ [80:61] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeprecatedSymbolUsageFixBase.Companion.Data?, right: DeprecatedSymbolUsageFixBase.Companion.Data): DeprecatedSymbolUsageFixBase.Companion.Data[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Data

'extractDataFromDiagnostic' @ [80:90] ==> public final fun extractDataFromDiagnostic(deprecatedDiagnostic: Diagnostic): DeprecatedSymbolUsageFixBase.Companion.Data? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageFixBase.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [80:116] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion.createAction[ValueParameterDescriptorImpl]

'RENDERER' @ [81:34] ==> private final val RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion[PropertyDescriptorImpl]

'render' @ [81:43] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [81:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion.createAction[LocalVariableDescriptor]

'DeprecatedSymbolUsageInWholeProjectFix' @ [82:20] ==> public constructor DeprecatedSymbolUsageInWholeProjectFix(element: KtSimpleNameExpression, replaceWith: ReplaceWith, text: String) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix[ClassConstructorDescriptorImpl]

'nameExpression' @ [82:59] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion.createAction[LocalVariableDescriptor]

'replacement' @ [82:75] ==> val replacement: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion.createAction[LocalVariableDescriptor]

'descriptorName' @ [82:109] ==> val descriptorName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.DeprecatedSymbolUsageInWholeProjectFix.Companion.createAction[LocalVariableDescriptor]

