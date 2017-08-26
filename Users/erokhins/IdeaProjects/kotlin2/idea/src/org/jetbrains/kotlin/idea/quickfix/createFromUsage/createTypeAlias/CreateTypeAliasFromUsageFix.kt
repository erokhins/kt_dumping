'CreateFromUsageFixBase<E>' @ [45:5] ==> public constructor CreateFromUsageFixBase<T : KtElement>(element: E) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.CreateFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> E

'element' @ [45:31] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.<init>[ValueParameterDescriptorImpl]

'aliasInfo' @ [46:52] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'name' @ [46:62] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'element' @ [49:23] ==> protected final val element: E? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'editor' @ [50:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [52:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [52:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[ValueParameterDescriptorImpl]

'createTypeAlias' @ [52:52] ==> public final fun createTypeAlias(name: String, typeParameters: List<String>, body: String): KtTypeAlias defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasInfo' @ [52:68] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'name' @ [52:78] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'aliasInfo' @ [52:84] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'typeParameterNames' @ [52:94] ==> public final val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'placeDeclarationInContainer' @ [53:25] ==> @Suppress internal fun <D : KtNamedDeclaration> placeDeclarationInContainer(declaration: KtTypeAlias, container: PsiElement, anchor: PsiElement, fileToEdit: KtFile = ...): KtTypeAlias defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : KtNamedDeclaration> -> KtTypeAlias

'typeAliasProto' @ [53:53] ==> val typeAliasProto: KtTypeAlias defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'aliasInfo' @ [53:69] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'targetParent' @ [53:79] ==> public final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'element' @ [53:93] ==> val element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'!' @ [55:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [55:33] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [55:50] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getInstance' @ [56:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [56:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [56:53] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [56:93] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[ValueParameterDescriptorImpl]

'document' @ [56:100] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'typeAlias' @ [58:29] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'getTypeReference' @ [58:39] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'with' @ [60:13] ==> @InlineOnly public inline fun <T, R> with(receiver: TemplateBuilderImpl, block: TemplateBuilderImpl.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TemplateBuilderImpl
    <R> -> Unit

'TemplateBuilderImpl' @ [60:18] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'typeAlias' @ [60:38] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'component1' @ [61:23] ==> public final operator fun component1(): (KtTypeParameter..KtTypeParameter?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [61:38] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'iterator' @ [61:60] ==> public abstract fun iterator(): Iterator<Pair<(KtTypeParameter..KtTypeParameter?), String>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [61:61] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'typeParameters' @ [61:71] ==> public final val KtTypeAlias.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'aliasInfo' @ [61:90] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'typeParameterNames' @ [61:100] ==> public final val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'replaceElement' @ [62:21] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'typeParameter' @ [62:36] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke.<anonymous>[LocalVariableDescriptor]

'ConstantNode' @ [62:51] ==> public constructor ConstantNode(p0: (String..String?)) defined in com.intellij.codeInsight.template.impl.ConstantNode[JavaClassConstructorDescriptor]

'typeParameterName' @ [62:64] ==> val typeParameterName: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke.<anonymous>[LocalVariableDescriptor]

'aliasInfo' @ [64:39] ==> private final val aliasInfo: TypeAliasInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix[PropertyDescriptorImpl]

'expectedType' @ [64:49] ==> public final val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.TypeAliasInfo[PropertyDescriptorImpl]

'let' @ [64:63] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [64:69] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [64:92] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [64:104] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [64:115] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'replaceElement' @ [65:17] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'aliasBody' @ [65:32] ==> val aliasBody: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[LocalVariableDescriptor]

'ConstantNode' @ [65:43] ==> public constructor ConstantNode(p0: (String..String?)) defined in com.intellij.codeInsight.template.impl.ConstantNode[JavaClassConstructorDescriptor]

'defaultBodyText' @ [65:56] ==> val defaultBodyText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke.<anonymous>[LocalVariableDescriptor]

'run' @ [67:17] ==> public open fun run(@NotNull p0: Editor, p1: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'editor' @ [67:21] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeAlias.CreateTypeAliasFromUsageFix.invoke[ValueParameterDescriptorImpl]

