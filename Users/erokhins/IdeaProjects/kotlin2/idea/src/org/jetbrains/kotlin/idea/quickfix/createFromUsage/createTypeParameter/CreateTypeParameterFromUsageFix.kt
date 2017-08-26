'CreateFromUsageFixBase<KtElement>' @ [49:5] ==> public constructor CreateFromUsageFixBase<T : KtElement>(element: KtElement) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.CreateFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtElement

'originalElement' @ [49:39] ==> value-parameter originalElement: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.<init>[ValueParameterDescriptorImpl]

'let' @ [51:39] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (data.typeParameters.size > 1) StringUtil.pluralize(it) else it' @ [51:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'data' @ [51:49] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'typeParameters' @ [51:54] ==> public final val typeParameters: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'size' @ [51:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'pluralize' @ [51:90] ==> @NotNull @Contract public open fun pluralize(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [51:100] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [51:109] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'if (presentTypeParameterNames) data.typeParameters.joinToString(prefix = " ") { "'${it.name}'" } else ""' @ [52:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'presentTypeParameterNames' @ [52:38] ==> private final val presentTypeParameterNames: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'data' @ [52:65] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'typeParameters' @ [52:70] ==> public final val typeParameters: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'joinToString' @ [52:85] ==> public fun <T> Iterable<TypeParameterInfo>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypeParameterInfo) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo

'it' @ [52:118] ==> value-parameter it: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [52:121] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'+' @ [53:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getElementDescription' @ [53:52] ==> @NotNull public open fun getElementDescription(@NotNull p0: PsiElement, @NotNull p1: ElementDescriptionLocation): String defined in com.intellij.psi.ElementDescriptionUtil[JavaMethodDescriptor]

'data' @ [53:74] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'declaration' @ [53:79] ==> public final val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'INSTANCE' @ [53:114] ==> public final val INSTANCE: (UsageViewTypeLocation..UsageViewTypeLocation?) defined in com.intellij.usageView.UsageViewTypeLocation[JavaPropertyDescriptor]

'data' @ [54:34] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'declaration' @ [54:39] ==> public final val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'name' @ [54:51] ==> public final val KtTypeParameterListOwner.name: String?[MyPropertyDescriptor]

'prefix' @ [55:25] ==> val prefix: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText[LocalVariableDescriptor]

'typeParametersText' @ [55:32] ==> val typeParametersText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText[LocalVariableDescriptor]

'containerText' @ [55:55] ==> val containerText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.getText[LocalVariableDescriptor]

'doInvoke' @ [61:9] ==> public final fun doInvoke(): List<KtTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[SimpleFunctionDescriptorImpl]

'data' @ [65:27] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'declaration' @ [65:32] ==> public final val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'declaration' @ [66:23] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'project' @ [66:35] ==> public final val KtTypeParameterListOwner.project: Project[MyPropertyDescriptor]

'project' @ [67:22] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'runSynchronouslyWithProgress' @ [67:30] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> Set<KtElement>): Set<KtElement>? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<KtElement>

'declaration' @ [67:72] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'name' @ [67:84] ==> public final val KtTypeParameterListOwner.name: String?[MyPropertyDescriptor]

'runReadAction' @ [68:13] ==> public fun <T> runReadAction(action: () -> Set<KtElement>): Set<KtElement> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<KtElement>

'declaration' @ [69:49] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'typeParameters' @ [69:61] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'size' @ [69:76] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'data' @ [69:83] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'typeParameters' @ [69:88] ==> public final val typeParameters: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'size' @ [69:103] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'search' @ [71:26] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [71:33] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'mapNotNull' @ [72:26] ==> public inline fun <T, R : Any> Iterable<(PsiReference..PsiReference?)>.mapNotNull(transform: ((PsiReference..PsiReference?)) -> KtElement?): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> KtElement

'it' @ [73:29] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [73:32] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [73:40] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'referenceExpression' @ [73:79] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'it' @ [74:29] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [74:32] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [74:40] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [74:82] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'filter' @ [76:26] ==> public inline fun <T> Iterable<KtElement>.filter(predicate: (KtElement) -> Boolean): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'when (it) {
                                is KtUserType -> it.typeArguments
                                is KtCallElement -> it.typeArguments
                                else -> return@filter false
                            }' @ [77:45] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>), entry1: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>), entry2: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)): (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)>)

'it' @ [77:51] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [78:50] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArguments' @ [78:53] ==> public final val KtUserType.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'it' @ [79:53] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArguments' @ [79:56] ==> public final val KtCallElement.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'arguments' @ [82:29] ==> val arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [82:39] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'expectedTypeArgumentCount' @ [82:47] ==> val expectedTypeArgumentCount: Int defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toSet' @ [84:26] ==> public fun <T> Iterable<KtElement>.toSet(): Set<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'emptyList' @ [86:21] ==> public fun <T> emptyList(): List<KtTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'runWriteAction' @ [88:16] ==> public fun <T> runWriteAction(action: () -> List<KtTypeParameter>): List<KtTypeParameter> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtTypeParameter>

'KtPsiFactory' @ [89:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [89:43] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'SmartList' @ [91:37] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'data' @ [93:37] ==> private final val data: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[PropertyDescriptorImpl]

'typeParameters' @ [93:42] ==> public final val typeParameters: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'map' @ [93:57] ==> public inline fun <T, R> Iterable<TypeParameterInfo>.map(transform: (TypeParameterInfo) -> KtTypeParameter): List<KtTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo
    <R> -> KtTypeParameter

'typeParameter' @ [94:38] ==> value-parameter typeParameter: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'upperBoundType' @ [94:52] ==> public final val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'if (upperBoundType != null && !upperBoundType.isNullableAny()) {
                    IdeDescriptorRenderers.SOURCE_CODE.renderType(upperBoundType)
                }
                else null' @ [95:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'upperBoundType' @ [95:42] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [95:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'upperBoundType' @ [95:69] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isNullableAny' @ [95:84] ==> public fun KotlinType.isNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [96:21] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [96:44] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [96:56] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'upperBoundType' @ [96:67] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'upperBoundText' @ [99:34] ==> val upperBoundText: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [99:50] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KtTypeReference): KtTypeReference defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KtTypeReference

'psiFactory' @ [99:56] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'createType' @ [99:67] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [99:78] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (upperBound != null) "${typeParameter.name} : ${upperBound.text}" else typeParameter.name' @ [100:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'upperBound' @ [100:48] ==> val upperBound: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [100:71] ==> value-parameter typeParameter: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:85] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'upperBound' @ [100:95] ==> val upperBound: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [100:106] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'typeParameter' @ [100:118] ==> value-parameter typeParameter: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:132] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'declaration' @ [101:40] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'addTypeParameter' @ [101:52] ==> public fun KtTypeParameterListOwner.addTypeParameter(typeParameter: KtTypeParameter): KtTypeParameter? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [101:69] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'createTypeParameter' @ [101:80] ==> public final fun createTypeParameter(text: String): KtTypeParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newTypeParameterText' @ [101:100] ==> val newTypeParameterText: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'elementsToShorten' @ [102:17] ==> val elementsToShorten: SmartList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'newTypeParameter' @ [102:38] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createFakeTypeParameterDescriptor' @ [104:47] ==> public fun createFakeTypeParameterDescriptor(containingDescriptor: DeclarationDescriptor, name: String): TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter in file CreateTypeParameterByUnresolvedRefActionFactory.kt[SimpleFunctionDescriptorImpl]

'typeParameter' @ [104:81] ==> value-parameter typeParameter: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fakeTypeParameter' @ [104:95] ==> public final val fakeTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'containingDeclaration' @ [104:113] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'upperBoundType' @ [105:48] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [105:64] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType?

'create' @ [107:30] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'mapOf' @ [107:37] ==> public fun <K, V> mapOf(pair: Pair<(TypeConstructor..TypeConstructor?), TypeProjectionImpl>): Map<(TypeConstructor..TypeConstructor?), TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.types.TypeConstructor..org.jetbrains.kotlin.types.TypeConstructor?)
    <V> -> TypeProjectionImpl

'typeParameter' @ [107:43] ==> value-parameter typeParameter: TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fakeTypeParameter' @ [107:57] ==> public final val fakeTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[PropertyDescriptorImpl]

'typeConstructor' @ [107:75] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [107:94] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'anonymizedTypeParameter' @ [107:113] ==> val anonymizedTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [107:137] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'substitute' @ [108:30] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'upperBoundType' @ [108:41] ==> val upperBoundType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'INVARIANT' @ [108:66] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'let' @ [109:20] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [110:21] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [110:44] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [110:56] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [110:67] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [113:53] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'createTypeArgument' @ [113:64] ==> public final fun createTypeArgument(text: String): (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'anonymizedUpperBoundText' @ [113:83] ==> val anonymizedUpperBoundText: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'SmartList' @ [115:49] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtCallElement

'usages' @ [116:17] ==> val usages: Set<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke[LocalVariableDescriptor]

'forEach' @ [116:24] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'when (it) {
                        is KtUserType -> {
                            val typeArgumentList = it.typeArgumentList
                            elementsToShorten += if (typeArgumentList != null) {
                                typeArgumentList.addArgument(anonymizedUpperBoundAsTypeArg)
                            }
                            else {
                                it.addAfter(
                                        psiFactory.createTypeArguments("<${anonymizedUpperBoundAsTypeArg.text}>"),
                                        it.referenceExpression!!
                                ) as KtTypeArgumentList
                            }
                        }
                        is KtCallElement -> {
                            if (it.analyze(BodyResolveMode.PARTIAL_WITH_DIAGNOSTICS).diagnostics.forElement(it.calleeExpression!!).any {
                                it.factory in Errors.TYPE_INFERENCE_ERRORS
                            }) {
                                callsToExplicateArguments += it
                            }
                        }
                    }' @ [117:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'it' @ [117:27] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [119:52] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArgumentList' @ [119:55] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'elementsToShorten' @ [120:29] ==> val elementsToShorten: SmartList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'if (typeArgumentList != null) {
                                typeArgumentList.addArgument(anonymizedUpperBoundAsTypeArg)
                            }
                            else {
                                it.addAfter(
                                        psiFactory.createTypeArguments("<${anonymizedUpperBoundAsTypeArg.text}>"),
                                        it.referenceExpression!!
                                ) as KtTypeArgumentList
                            }' @ [120:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>, elseBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>): KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>?)>

'typeArgumentList' @ [120:54] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'typeArgumentList' @ [121:33] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [121:50] ==> @NotNull public open fun addArgument(@NotNull p0: KtTypeProjection): KtTypeProjection defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'anonymizedUpperBoundAsTypeArg' @ [121:62] ==> val anonymizedUpperBoundAsTypeArg: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [124:33] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [124:36] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [125:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'createTypeArguments' @ [125:52] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'anonymizedUpperBoundAsTypeArg' @ [125:76] ==> val anonymizedUpperBoundAsTypeArg: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [125:106] ==> public final val KtTypeProjection.text: (String..String?)[MyPropertyDescriptor]

'it' @ [126:41] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'referenceExpression' @ [126:44] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'it' @ [131:33] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [131:36] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [131:60] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'diagnostics' @ [131:86] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [131:98] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'it' @ [131:109] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [131:112] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'any' @ [131:132] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [132:33] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [132:36] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'TYPE_INFERENCE_ERRORS' @ [132:54] ==> public final val TYPE_INFERENCE_ERRORS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'callsToExplicateArguments' @ [134:33] ==> val callsToExplicateArguments: SmartList<KtCallElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [134:62] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callsToExplicateArguments' @ [140:17] ==> val callsToExplicateArguments: SmartList<KtCallElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [140:43] ==> @HidesMembers public inline fun <T> Iterable<(KtCallElement..KtCallElement?)>.forEach(action: ((KtCallElement..KtCallElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtCallElement..org.jetbrains.kotlin.psi.KtCallElement?)

'it' @ [141:44] ==> value-parameter it: (KtCallElement..KtCallElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArgumentList' @ [141:47] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'elementsToShorten' @ [142:21] ==> val elementsToShorten: SmartList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'if (typeArgumentList == null) {
                        InsertExplicitTypeArgumentsIntention.applyTo(it, shortenReferences = false)

                        val newTypeArgument = it.typeArguments.lastOrNull()
                        if (anonymizedUpperBoundText != null && newTypeArgument != null && newTypeArgument.text == "kotlin.Any") {
                            newTypeArgument.replaced(anonymizedUpperBoundAsTypeArg)
                        }

                        it.typeArgumentList
                    }
                    else {
                        typeArgumentList.addArgument(anonymizedUpperBoundAsTypeArg)
                    }' @ [142:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?, elseBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?): KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>?)>?

'typeArgumentList' @ [142:46] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'InsertExplicitTypeArgumentsIntention' @ [143:25] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention[FakeCallableDescriptorForObject]

'applyTo' @ [143:62] ==> public final fun applyTo(element: KtCallElement, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [143:70] ==> value-parameter it: (KtCallElement..KtCallElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [145:47] ==> value-parameter it: (KtCallElement..KtCallElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArguments' @ [145:50] ==> public final val KtCallElement.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'lastOrNull' @ [145:64] ==> public fun <T> List<(KtTypeProjection..KtTypeProjection?)>.lastOrNull(): KtTypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'anonymizedUpperBoundText' @ [146:29] ==> val anonymizedUpperBoundText: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newTypeArgument' @ [146:65] ==> val newTypeArgument: KtTypeProjection? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newTypeArgument' @ [146:92] ==> val newTypeArgument: KtTypeProjection? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'text' @ [146:108] ==> public final val KtTypeProjection.text: (String..String?)[MyPropertyDescriptor]

'newTypeArgument' @ [147:29] ==> val newTypeArgument: KtTypeProjection? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replaced' @ [147:45] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: (KtTypeProjection..KtTypeProjection?)): (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'anonymizedUpperBoundAsTypeArg' @ [147:54] ==> val anonymizedUpperBoundAsTypeArg: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [150:25] ==> value-parameter it: (KtCallElement..KtCallElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeArgumentList' @ [150:28] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'typeArgumentList' @ [153:25] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [153:42] ==> @NotNull public open fun addArgument(@NotNull p0: KtTypeProjection): KtTypeProjection defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'anonymizedUpperBoundAsTypeArg' @ [153:54] ==> val anonymizedUpperBoundAsTypeArg: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newTypeParameter' @ [157:17] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ShortenReferences' @ [160:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [160:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [160:39] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'elementsToShorten' @ [160:47] ==> val elementsToShorten: SmartList<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

'newTypeParameters' @ [162:13] ==> val newTypeParameters: List<KtTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix.doInvoke.<anonymous>[LocalVariableDescriptor]

