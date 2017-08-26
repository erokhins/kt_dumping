'IntroduceTypeAliasAnalysisResult' @ [51:40] ==> private constructor IntroduceTypeAliasAnalysisResult() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult[ClassConstructorDescriptorImpl]

'IntroduceTypeAliasAnalysisResult' @ [52:67] ==> private constructor IntroduceTypeAliasAnalysisResult() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult[ClassConstructorDescriptorImpl]

'targetSibling' @ [55:55] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'getResolutionScope' @ [55:69] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [55:88] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'resolutionFacade' @ [55:104] ==> public final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'KtPsiFactory' @ [58:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalTypeElement' @ [58:35] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'originalTypeElement' @ [60:29] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'getStrictParentOfType' @ [60:49] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'getTargetScope' @ [61:23] ==> private fun IntroduceTypeAliasData.getTargetScope(): LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'psiFactory' @ [63:20] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'createProperty' @ [63:31] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'apply' @ [63:60] ==> @InlineOnly public inline fun <T> KtProperty.apply(block: KtProperty.() -> Unit): KtProperty defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'typeReference' @ [64:9] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'replace' @ [64:25] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'originalTypeElement' @ [65:17] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'parent' @ [65:37] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (originalTypeElement is KtTypeElement) psiFactory.createType(originalTypeElement) else psiFactory.createType(originalTypeElement.text)' @ [66:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference, elseBranch: KtTypeReference): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference

'originalTypeElement' @ [66:21] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'psiFactory' @ [66:59] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'createType' @ [66:70] ==> public final fun createType(typeElement: KtTypeElement): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'originalTypeElement' @ [66:81] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'psiFactory' @ [66:107] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'createType' @ [66:118] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'originalTypeElement' @ [66:129] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'text' @ [66:149] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'dummyVar' @ [68:28] ==> val dummyVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'typeReference' @ [68:37] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'newTypeReference' @ [69:25] ==> val newTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'collectDescendantsOfType' @ [69:42] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtTypeReference) -> Boolean = ...): List<KtTypeReference> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'it' @ [69:86] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'resolveInfo' @ [69:89] ==> internal var KtTypeReference.resolveInfo: TypeReferenceInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file extractionModel.kt[PropertyDescriptorImpl]

'dummyVar' @ [70:22] ==> val dummyVar: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'analyzeInContext' @ [70:31] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'targetScope' @ [70:48] ==> val targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'contextExpression' @ [70:61] ==> val contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'originalTypeElement' @ [71:19] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'project' @ [71:39] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'KotlinPsiUnifier' @ [73:19] ==> public companion object defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[FakeCallableDescriptorForObject]

'DEFAULT' @ [73:36] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'LinkedMultiMap' @ [74:38] ==> public constructor LinkedMultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.LinkedMultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeReferenceInfo
    <V : (Any..Any?)> -> TypeReferenceInfo

'if (extractTypeConstructor) newTypeReference.typeElement!!.typeArgumentsAsTypes else emptyList()' @ [76:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>), elseBranch: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)): (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)>)

'extractTypeConstructor' @ [76:32] ==> public final val extractTypeConstructor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'newTypeReference' @ [76:56] ==> val newTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'typeElement' @ [76:73] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeArgumentsAsTypes' @ [76:87] ==> public final val KtTypeElement.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'emptyList' @ [76:113] ==> public fun <T> emptyList(): List<(KtTypeReference..KtTypeReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'newReferences' @ [78:26] ==> val newReferences: List<KtTypeReference> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'newReference' @ [79:27] ==> val newReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'resolveInfo' @ [79:40] ==> internal var KtTypeReference.resolveInfo: TypeReferenceInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file extractionModel.kt[PropertyDescriptorImpl]

'newReference' @ [81:13] ==> val newReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'forcedCandidates' @ [81:30] ==> val forcedCandidates: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'resolveInfo' @ [82:38] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'type' @ [82:50] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'constructor' @ [82:55] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [82:67] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'newContext' @ [83:33] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'TYPE' @ [83:59] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'newReference' @ [83:65] ==> val newReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'constructor' @ [83:80] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [83:93] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'compareDescriptors' @ [84:17] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [84:36] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'originalDescriptor' @ [84:45] ==> val originalDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'newDescriptor' @ [84:65] ==> val newDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'groupedReferencesToExtract' @ [87:41] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'keySet' @ [88:18] ==> @NotNull public open fun keySet(): (MutableSet<(TypeReferenceInfo..TypeReferenceInfo?)>..Set<(TypeReferenceInfo..TypeReferenceInfo?)>) defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'firstOrNull' @ [89:18] ==> public inline fun <T> Iterable<(TypeReferenceInfo..TypeReferenceInfo?)>.firstOrNull(predicate: ((TypeReferenceInfo..TypeReferenceInfo?)) -> Boolean): TypeReferenceInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo..org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo?)

'unifier' @ [89:32] ==> val unifier: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'unify' @ [89:40] ==> public final fun unify(targetElement: PsiElement?, patternElement: PsiElement?): UnificationResult defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[DeserializedSimpleFunctionDescriptor]

'it' @ [89:46] ==> value-parameter it: (TypeReferenceInfo..TypeReferenceInfo?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [89:49] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'resolveInfo' @ [89:60] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'reference' @ [89:72] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'matched' @ [89:83] ==> public open val matched: Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult[DeserializedPropertyDescriptor]

'if (equivalenceRepresentative != null) {
            groupedReferencesToExtract.putValue(equivalenceRepresentative, resolveInfo)
        }
        else {
            groupedReferencesToExtract.putValue(resolveInfo, resolveInfo)
        }' @ [90:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'equivalenceRepresentative' @ [90:13] ==> val equivalenceRepresentative: TypeReferenceInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'groupedReferencesToExtract' @ [91:13] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'putValue' @ [91:40] ==> public open fun putValue(@Nullable p0: TypeReferenceInfo?, p1: (TypeReferenceInfo..TypeReferenceInfo?)): Unit defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'equivalenceRepresentative' @ [91:49] ==> val equivalenceRepresentative: TypeReferenceInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'resolveInfo' @ [91:76] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'groupedReferencesToExtract' @ [94:13] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'putValue' @ [94:40] ==> public open fun putValue(@Nullable p0: TypeReferenceInfo?, p1: (TypeReferenceInfo..TypeReferenceInfo?)): Unit defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'resolveInfo' @ [94:49] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'resolveInfo' @ [94:62] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'groupedReferencesToExtract' @ [97:43] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'values' @ [97:70] ==> @NotNull public open fun values(): (MutableCollection<out (TypeReferenceInfo..TypeReferenceInfo?)>..Collection<(TypeReferenceInfo..TypeReferenceInfo?)>) defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'iterator' @ [97:79] ==> public abstract fun iterator(): MutableIterator<(TypeReferenceInfo..TypeReferenceInfo?)> defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'referencesToExtractIterator' @ [98:16] ==> val referencesToExtractIterator: MutableIterator<(TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'hasNext' @ [98:44] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'referencesToExtractIterator' @ [99:38] ==> val referencesToExtractIterator: MutableIterator<(TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'next' @ [99:66] ==> public abstract fun next(): (TypeReferenceInfo..TypeReferenceInfo?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'resolveInfo' @ [100:17] ==> val resolveInfo: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'reference' @ [100:29] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'isAncestor' @ [100:39] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'referenceToExtract' @ [100:50] ==> val referenceToExtract: (TypeReferenceInfo..TypeReferenceInfo?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'reference' @ [100:69] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'referencesToExtractIterator' @ [101:17] ==> val referencesToExtractIterator: MutableIterator<(TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'remove' @ [101:45] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'CollectingNameValidator' @ [106:38] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'groupedReferencesToExtract' @ [107:28] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'keySet' @ [107:55] ==> @NotNull public open fun keySet(): (MutableSet<(TypeReferenceInfo..TypeReferenceInfo?)>..Set<(TypeReferenceInfo..TypeReferenceInfo?)>) defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'filter' @ [107:64] ==> public inline fun <T> Iterable<(TypeReferenceInfo..TypeReferenceInfo?)>.filter(predicate: ((TypeReferenceInfo..TypeReferenceInfo?)) -> Boolean): List<(TypeReferenceInfo..TypeReferenceInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo..org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo?)

'groupedReferencesToExtract' @ [107:73] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'it' @ [107:100] ==> value-parameter it: (TypeReferenceInfo..TypeReferenceInfo?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [107:104] ==> @InlineOnly public inline fun <T> Collection<(TypeReferenceInfo..TypeReferenceInfo?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo..org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo?)

'KotlinNameSuggester' @ [108:30] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesForTypeParameters' @ [108:50] ==> public final fun suggestNamesForTypeParameters(count: Int, validator: (String) -> Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'brokenReferences' @ [108:80] ==> val brokenReferences: List<(TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'size' @ [108:97] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeParameterNameValidator' @ [108:103] ==> val typeParameterNameValidator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'typeParameterNames' @ [109:27] ==> val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'brokenReferences' @ [109:50] ==> val brokenReferences: List<(TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'map' @ [109:68] ==> public inline fun <T, R> Iterable<Pair<String, (TypeReferenceInfo..TypeReferenceInfo?)>>.map(transform: (Pair<String, (TypeReferenceInfo..TypeReferenceInfo?)>) -> TypeParameter): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, (org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo..org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo?)>
    <R> -> TypeParameter

'TypeParameter' @ [109:74] ==> public constructor TypeParameter(name: String, typeReferenceInfos: Collection<TypeReferenceInfo>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[ClassConstructorDescriptorImpl]

'it' @ [109:88] ==> value-parameter it: Pair<String, (TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [109:91] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'groupedReferencesToExtract' @ [109:98] ==> val groupedReferencesToExtract: LinkedMultiMap<TypeReferenceInfo, TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'it' @ [109:125] ==> value-parameter it: Pair<String, (TypeReferenceInfo..TypeReferenceInfo?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [109:128] ==> public final val second: (TypeReferenceInfo..TypeReferenceInfo?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'typeParameters' @ [111:9] ==> val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'any' @ [111:24] ==> public inline fun <T> Iterable<TypeParameter>.any(predicate: (TypeParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'it' @ [111:30] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'typeReferenceInfos' @ [111:33] ==> public final val typeReferenceInfos: Collection<TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'any' @ [111:52] ==> public inline fun <T> Iterable<TypeReferenceInfo>.any(predicate: (TypeReferenceInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeReferenceInfo

'it' @ [111:58] ==> value-parameter it: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [111:61] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'typeElement' @ [111:71] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'originalTypeElement' @ [111:86] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'Error' @ [112:49] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult.Error[ClassConstructorDescriptorImpl]

'IntroduceTypeAliasDescriptor' @ [115:22] ==> public constructor IntroduceTypeAliasDescriptor(originalData: IntroduceTypeAliasData, name: String, visibility: KtModifierKeywordToken?, typeParameters: List<TypeParameter>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[ClassConstructorDescriptorImpl]

'this' @ [115:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[ReceiverParameterDescriptorImpl]

'typeParameters' @ [115:72] ==> val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'KotlinNameSuggester' @ [117:23] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestTypeAliasNameByPsi' @ [117:43] ==> public final fun suggestTypeAliasNameByPsi(typeElement: KtTypeElement, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [117:69] ==> val descriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'generateTypeAlias' @ [117:80] ==> public fun IntroduceTypeAliasDescriptor.generateTypeAlias(previewOnly: Boolean = ...): KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'getTypeReference' @ [117:104] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'typeElement' @ [117:125] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'targetScope' @ [118:9] ==> val targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'findClassifier' @ [118:21] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [118:41] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [118:52] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [118:74] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'Success' @ [121:45] ==> public constructor Success(descriptor: IntroduceTypeAliasDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult.Success[ClassConstructorDescriptorImpl]

'descriptor' @ [121:53] ==> val descriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'copy' @ [121:64] ==> public final fun copy(originalData: IntroduceTypeAliasData = ..., name: String = ..., visibility: KtModifierKeywordToken? = ..., typeParameters: List<TypeParameter> = ...): IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[SimpleFunctionDescriptorImpl]

'initialName' @ [121:76] ==> val initialName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.analyze[LocalVariableDescriptor]

'targetSibling' @ [125:18] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'parent' @ [125:32] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtClassBody -> listOf(PRIVATE_KEYWORD, PUBLIC_KEYWORD, INTERNAL_KEYWORD, PROTECTED_KEYWORD)
        is KtFile -> listOf(PRIVATE_KEYWORD, PUBLIC_KEYWORD, INTERNAL_KEYWORD)
        else -> emptyList()
    }' @ [126:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtModifierKeywordToken>, entry1: List<KtModifierKeywordToken>, entry2: List<KtModifierKeywordToken>): List<KtModifierKeywordToken>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtModifierKeywordToken>

'parent' @ [126:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.getApplicableVisibilities[LocalVariableDescriptor]

'listOf' @ [127:27] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PRIVATE_KEYWORD' @ [127:34] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [127:51] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [127:67] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [127:85] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [128:22] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PRIVATE_KEYWORD' @ [128:29] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [128:46] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [128:62] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'emptyList' @ [129:17] ==> public fun <T> emptyList(): List<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'MultiMap' @ [134:21] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'originalData' @ [136:24] ==> public final val originalData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'originalTypeElement' @ [136:37] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'when {
        name.isEmpty() ->
            conflicts.putValue(originalType, "No name provided for type alias")
        !KotlinNameSuggester.isIdentifier(name) ->
            conflicts.putValue(originalType, "Type alias name must be a valid identifier: $name")
        originalData.getTargetScope().findClassifier(Name.identifier(name), NoLookupLocation.FROM_IDE) != null ->
            conflicts.putValue(originalType, "Type $name already exists in the target scope")
    }' @ [137:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [138:9] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'isEmpty' @ [138:14] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [139:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'putValue' @ [139:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalType' @ [139:32] ==> val originalType: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'!' @ [140:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [140:10] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [140:30] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'name' @ [140:43] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'conflicts' @ [141:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'putValue' @ [141:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalType' @ [141:32] ==> val originalType: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'name' @ [141:92] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'originalData' @ [142:9] ==> public final val originalData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'getTargetScope' @ [142:22] ==> private fun IntroduceTypeAliasData.getTargetScope(): LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'findClassifier' @ [142:39] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [142:59] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [142:70] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'FROM_IDE' @ [142:94] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'conflicts' @ [143:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'putValue' @ [143:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalType' @ [143:32] ==> val originalType: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'name' @ [143:53] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameters' @ [146:9] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'distinctBy' @ [146:24] ==> public inline fun <T, K> Iterable<TypeParameter>.distinctBy(selector: (TypeParameter) -> String): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <K> -> String

'it' @ [146:37] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [146:40] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'size' @ [146:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeParameters' @ [146:55] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'size' @ [146:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'conflicts' @ [147:9] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'putValue' @ [147:19] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalType' @ [147:28] ==> val originalType: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'visibility' @ [150:9] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'visibility' @ [150:31] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'originalData' @ [150:46] ==> public final val originalData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'getApplicableVisibilities' @ [150:59] ==> public fun IntroduceTypeAliasData.getApplicableVisibilities(): List<KtModifierKeywordToken> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [151:9] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'putValue' @ [151:19] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'originalType' @ [151:28] ==> val originalType: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'visibility' @ [151:45] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'IntroduceTypeAliasDescriptorWithConflicts' @ [154:12] ==> public constructor IntroduceTypeAliasDescriptorWithConflicts(descriptor: IntroduceTypeAliasDescriptor, conflicts: MultiMap<PsiElement, String>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptorWithConflicts[ClassConstructorDescriptorImpl]

'this' @ [154:54] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[ReceiverParameterDescriptorImpl]

'conflicts' @ [154:60] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.validate[LocalVariableDescriptor]

'typeAlias' @ [158:21] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'name' @ [158:31] ==> public final val KtTypeAlias.name: String?[MyPropertyDescriptor]

'quoteIfNeeded' @ [158:37] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [158:63] ==> public fun <K, V> emptyMap(): Map<KotlinPsiRange, () -> Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'typeAlias' @ [159:22] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'textRange' @ [159:32] ==> public final val KtTypeAlias.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'typeAlias' @ [160:31] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [160:41] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'typeAliasDescriptor' @ [162:29] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'declaredTypeParameters' @ [162:49] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [162:72] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> UnifierParameter): List<UnifierParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> UnifierParameter

'UnifierParameter' @ [162:78] ==> public constructor UnifierParameter(descriptor: DeclarationDescriptor, expectedType: KotlinType?) defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnifierParameter[DeserializedClassConstructorDescriptor]

'it' @ [162:95] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'KotlinPsiUnifier' @ [163:19] ==> public constructor KotlinPsiUnifier(parameters: Collection<UnifierParameter> = ..., allowWeakMatches: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[DeserializedClassConstructorDescriptor]

'unifierParameters' @ [163:36] ==> val unifierParameters: List<UnifierParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'KtPsiFactory' @ [165:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [165:35] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'if (arguments.isNotEmpty()) "<${arguments.joinToString { it.text }}>" else ""' @ [168:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'arguments' @ [168:37] ==> value-parameter arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'isNotEmpty' @ [168:47] ==> @InlineOnly public inline fun <T> Collection<KtTypeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement

'arguments' @ [168:65] ==> value-parameter arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'joinToString' @ [168:75] ==> public fun <T> Iterable<KtTypeElement>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtTypeElement) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement

'it' @ [168:90] ==> value-parameter it: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [168:93] ==> public final val KtTypeElement.text: (String..String?)[MyPropertyDescriptor]

'when (occurrence) {
            is KtTypeElement -> {
                occurrence.replace(psiFactory.createType("$aliasName$typeArgumentsText").typeElement!!)
            }

            is KtCallElement -> {
                val typeArgumentList = occurrence.typeArgumentList
                if (arguments.isNotEmpty()) {
                    val newTypeArgumentList = psiFactory.createTypeArguments(typeArgumentsText)
                    typeArgumentList?.replace(newTypeArgumentList) ?: occurrence.addAfter(newTypeArgumentList, occurrence)
                }
                else {
                    typeArgumentList?.delete()
                }
                occurrence.calleeExpression?.replace(psiFactory.createExpression(aliasName))
            }

            is KtExpression -> occurrence.replace(psiFactory.createExpression(aliasName))
        }' @ [169:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'occurrence' @ [169:15] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'occurrence' @ [171:17] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'replace' @ [171:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [171:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'createType' @ [171:47] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasName' @ [171:60] ==> val aliasName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'typeArgumentsText' @ [171:70] ==> val typeArgumentsText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'typeElement' @ [171:90] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'occurrence' @ [175:40] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'typeArgumentList' @ [175:51] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'if (arguments.isNotEmpty()) {
                    val newTypeArgumentList = psiFactory.createTypeArguments(typeArgumentsText)
                    typeArgumentList?.replace(newTypeArgumentList) ?: occurrence.addAfter(newTypeArgumentList, occurrence)
                }
                else {
                    typeArgumentList?.delete()
                }' @ [176:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'arguments' @ [176:21] ==> value-parameter arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'isNotEmpty' @ [176:31] ==> @InlineOnly public inline fun <T> Collection<KtTypeElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement

'psiFactory' @ [177:47] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'createTypeArguments' @ [177:58] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeArgumentsText' @ [177:78] ==> val typeArgumentsText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'typeArgumentList' @ [178:21] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'replace' @ [178:39] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'newTypeArgumentList' @ [178:47] ==> val newTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'occurrence' @ [178:71] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'addAfter' @ [178:82] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newTypeArgumentList' @ [178:91] ==> val newTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'occurrence' @ [178:112] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'typeArgumentList' @ [181:21] ==> val typeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[LocalVariableDescriptor]

'delete' @ [181:39] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'occurrence' @ [183:17] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'calleeExpression' @ [183:28] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'replace' @ [183:46] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [183:54] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'createExpression' @ [183:65] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasName' @ [183:82] ==> val aliasName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'occurrence' @ [186:32] ==> value-parameter occurrence: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.replaceOccurrence[ValueParameterDescriptorImpl]

'replace' @ [186:43] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [186:51] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'createExpression' @ [186:62] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasName' @ [186:79] ==> val aliasName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'ArrayList' @ [190:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KotlinPsiRange, Function0<Unit>>

'typeAliasDescriptor' @ [192:27] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'underlyingType' @ [192:47] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'constructor' @ [192:62] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [192:74] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [192:97] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtilsIde' @ [193:9] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [193:36] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [193:54] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'project' @ [193:64] ==> public final val KtTypeAlias.project: Project[MyPropertyDescriptor]

'it' @ [193:73] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'originalTypePsi' @ [195:9] ==> val originalTypePsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'iterator' @ [196:27] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [196:44] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'originalTypePsi' @ [196:51] ==> val originalTypePsi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'LocalSearchScope' @ [196:68] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'typeAlias' @ [196:85] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'parent' @ [196:95] ==> public final val KtTypeAlias.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'reference' @ [197:27] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'element' @ [197:37] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [198:18] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'textRange' @ [198:26] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'intersects' @ [198:36] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'aliasRange' @ [198:47] ==> val aliasRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'element' @ [203:31] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [203:39] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallElement.() -> PsiElement?): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'calleeExpression' @ [203:81] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (callElement != null) {
                occurrence = callElement
                arguments = callElement.typeArguments.mapNotNull { it.typeReference?.typeElement }
            }
            else {
                val userType = element.getParentOfTypeAndBranch<KtUserType> { referenceExpression }
                if (userType != null) {
                    occurrence = userType
                    arguments = userType.typeArgumentsAsTypes.mapNotNull { it.typeElement }
                }
                else continue
            }' @ [204:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callElement' @ [204:17] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'occurrence' @ [205:17] ==> val occurrence: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'callElement' @ [205:30] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'arguments' @ [206:17] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'callElement' @ [206:29] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'typeArguments' @ [206:41] ==> public final val KtCallElement.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'mapNotNull' @ [206:55] ==> public inline fun <T, R : Any> Iterable<(KtTypeProjection..KtTypeProjection?)>.mapNotNull(transform: ((KtTypeProjection..KtTypeProjection?)) -> KtTypeElement?): List<KtTypeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)
    <R : Any> -> KtTypeElement

'it' @ [206:68] ==> value-parameter it: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [206:71] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [206:86] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'element' @ [209:32] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [209:40] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'referenceExpression' @ [209:79] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'if (userType != null) {
                    occurrence = userType
                    arguments = userType.typeArgumentsAsTypes.mapNotNull { it.typeElement }
                }
                else continue' @ [210:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'userType' @ [210:21] ==> val userType: KtUserType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'occurrence' @ [211:21] ==> val occurrence: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'userType' @ [211:34] ==> val userType: KtUserType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'arguments' @ [212:21] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'userType' @ [212:33] ==> val userType: KtUserType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'typeArgumentsAsTypes' @ [212:42] ==> public final val KtUserType.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'mapNotNull' @ [212:63] ==> public inline fun <T, R : Any> Iterable<(KtTypeReference..KtTypeReference?)>.mapNotNull(transform: ((KtTypeReference..KtTypeReference?)) -> KtTypeElement?): List<KtTypeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <R : Any> -> KtTypeElement

'it' @ [212:76] ==> value-parameter it: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'typeElement' @ [212:79] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'arguments' @ [216:17] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'size' @ [216:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeAliasDescriptor' @ [216:35] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'declaredTypeParameters' @ [216:55] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [216:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'rangesWithReplacers' @ [217:13] ==> val rangesWithReplacers: ArrayList<Pair<KotlinPsiRange, () -> Unit>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'occurrence' @ [217:36] ==> val occurrence: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'toRange' @ [217:47] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'replaceOccurrence' @ [217:62] ==> local final fun replaceOccurrence(occurrence: PsiElement, arguments: List<KtTypeElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[SimpleFunctionDescriptorImpl]

'occurrence' @ [217:80] ==> val occurrence: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'arguments' @ [217:92] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'typeAlias' @ [220:5] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'getTypeReference' @ [221:14] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'typeElement' @ [222:15] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'toRange' @ [223:14] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'match' @ [224:14] ==> public open fun match(scope: PsiElement, unifier: KotlinPsiUnifier): List<UnificationResult.Matched> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [224:20] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[ValueParameterDescriptorImpl]

'parent' @ [224:30] ==> public final val KtTypeAlias.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'unifier' @ [224:38] ==> val unifier: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'asSequence' @ [225:14] ==> public fun <T> Iterable<UnificationResult.Matched>.asSequence(): Sequence<UnificationResult.Matched> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched

'filter' @ [226:14] ==> public fun <T> Sequence<UnificationResult.Matched>.filter(predicate: (UnificationResult.Matched) -> Boolean): Sequence<UnificationResult.Matched> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched

'!' @ [226:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [226:25] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [226:28] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'getTextRange' @ [226:34] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'intersects' @ [226:49] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'aliasRange' @ [226:60] ==> val aliasRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'mapNotNullTo' @ [227:14] ==> public inline fun <T, R : Any, C : MutableCollection<in Pair<KotlinPsiRange, () -> Unit>>> Sequence<UnificationResult.Matched>.mapNotNullTo(destination: ArrayList<Pair<KotlinPsiRange, () -> Unit>>, transform: (UnificationResult.Matched) -> Pair<KotlinPsiRange, () -> Unit>?): ArrayList<Pair<KotlinPsiRange, () -> Unit>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched
    <R : Any> -> Pair<KotlinPsiRange, Function0<Unit>>
    <C : MutableCollection<in R>> -> ArrayList<Pair<KotlinPsiRange, Function0<Unit>>>

'rangesWithReplacers' @ [227:27] ==> val rangesWithReplacers: ArrayList<Pair<KotlinPsiRange, () -> Unit>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'match' @ [228:34] ==> value-parameter match: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [228:40] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'elements' @ [228:46] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'singleOrNull' @ [228:55] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'unifierParameters' @ [229:33] ==> val unifierParameters: List<UnifierParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'mapNotNull' @ [229:51] ==> public inline fun <T, R : Any> Iterable<UnifierParameter>.mapNotNull(transform: (UnifierParameter) -> KtTypeElement?): List<KtTypeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnifierParameter
    <R : Any> -> KtTypeElement

'match' @ [229:65] ==> value-parameter match: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'substitution' @ [229:71] ==> public abstract val substitution: Map<UnifierParameter, KtElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'it' @ [229:84] ==> value-parameter it: UnifierParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeElement' @ [229:110] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'arguments' @ [230:21] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[LocalVariableDescriptor]

'size' @ [230:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'unifierParameters' @ [230:39] ==> val unifierParameters: List<UnifierParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'size' @ [230:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'match' @ [231:17] ==> value-parameter match: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [231:23] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'replaceOccurrence' @ [231:34] ==> local final fun replaceOccurrence(occurrence: PsiElement, arguments: List<KtTypeElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[SimpleFunctionDescriptorImpl]

'occurrence' @ [231:52] ==> val occurrence: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[LocalVariableDescriptor]

'arguments' @ [231:64] ==> val arguments: List<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates.<anonymous>[LocalVariableDescriptor]

'rangesWithReplacers' @ [233:12] ==> val rangesWithReplacers: ArrayList<Pair<KotlinPsiRange, () -> Unit>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.findDuplicates[LocalVariableDescriptor]

'toMap' @ [233:32] ==> public fun <K, V> Iterable<Pair<KotlinPsiRange, () -> Unit>>.toMap(): Map<KotlinPsiRange, () -> Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'getValue' @ [236:67] ==> public final operator fun getValue(thisRef: R, property: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.CopyableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [236:96] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(TypeParameter..TypeParameter?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter..org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter?)

'originalData' @ [239:27] ==> public final val originalData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'originalTypeElement' @ [239:40] ==> public final val originalTypeElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

'KtPsiFactory' @ [240:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [240:35] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'typeParameters' @ [242:27] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameter' @ [243:20] ==> val typeParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'typeReferenceInfos' @ [243:34] ==> public final val typeReferenceInfos: Collection<TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'it' @ [244:13] ==> val it: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'reference' @ [244:16] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'typeParameterInfo' @ [244:26] ==> private var KtTypeReference.typeParameterInfo: TypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[PropertyDescriptorImpl]

'typeParameter' @ [244:46] ==> val typeParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'typeParameters' @ [247:30] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'map' @ [247:45] ==> public inline fun <T, R> Iterable<TypeParameter>.map(transform: (TypeParameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R> -> String

'it' @ [247:51] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [247:54] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'if (originalElement is KtTypeElement) {
        psiFactory.createTypeAlias(name, typeParameterNames, originalElement)
    }
    else {
        psiFactory.createTypeAlias(name, typeParameterNames, originalElement.text)
    }' @ [248:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeAlias, elseBranch: KtTypeAlias): KtTypeAlias[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeAlias

'originalElement' @ [248:25] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'psiFactory' @ [249:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'createTypeAlias' @ [249:20] ==> public final fun createTypeAlias(name: String, typeParameters: List<String>, typeElement: KtTypeElement): KtTypeAlias defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [249:36] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameterNames' @ [249:42] ==> val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'originalElement' @ [249:62] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'psiFactory' @ [252:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'createTypeAlias' @ [252:20] ==> public final fun createTypeAlias(name: String, typeParameters: List<String>, body: String): KtTypeAlias defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [252:36] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameterNames' @ [252:42] ==> val typeParameterNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'originalElement' @ [252:62] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'text' @ [252:78] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'visibility' @ [254:9] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'visibility' @ [254:31] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'DEFAULT_VISIBILITY_KEYWORD' @ [254:54] ==> public final val DEFAULT_VISIBILITY_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'typeAlias' @ [255:9] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'addModifier' @ [255:19] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]

'visibility' @ [255:31] ==> public final val visibility: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameters' @ [258:27] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameter' @ [259:20] ==> val typeParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'typeReferenceInfos' @ [259:34] ==> public final val typeReferenceInfos: Collection<TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'it' @ [260:13] ==> val it: TypeReferenceInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'reference' @ [260:16] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'typeParameterInfo' @ [260:26] ==> private var KtTypeReference.typeParameterInfo: TypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[PropertyDescriptorImpl]

'if (typeParameters.isNotEmpty()) {
            "$name<${typeParameters.joinToString { it.typeReferenceInfos.first().reference.text }}>"
        }
        else {
            name
        }' @ [264:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'typeParameters' @ [264:37] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'isNotEmpty' @ [264:52] ==> @InlineOnly public inline fun <T> Collection<TypeParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'name' @ [265:15] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'typeParameters' @ [265:22] ==> public final val typeParameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'joinToString' @ [265:37] ==> public fun <T> Iterable<TypeParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypeParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'it' @ [265:52] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.replaceUsage.<anonymous>[ValueParameterDescriptorImpl]

'typeReferenceInfos' @ [265:55] ==> public final val typeReferenceInfos: Collection<TypeReferenceInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'first' @ [265:74] ==> public fun <T> Iterable<TypeReferenceInfo>.first(): TypeReferenceInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeReferenceInfo

'reference' @ [265:82] ==> public final val reference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeReferenceInfo[PropertyDescriptorImpl]

'text' @ [265:92] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'name' @ [268:13] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'when (originalElement) {
            is KtTypeElement -> originalElement.replace(psiFactory.createType(aliasInstanceText).typeElement!!)
            is KtExpression -> originalElement.replace(psiFactory.createExpression(aliasInstanceText))
        }' @ [270:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'originalElement' @ [270:15] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'originalElement' @ [271:33] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'replace' @ [271:49] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [271:57] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'createType' @ [271:68] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasInstanceText' @ [271:79] ==> val aliasInstanceText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.replaceUsage[LocalVariableDescriptor]

'typeElement' @ [271:98] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'originalElement' @ [272:32] ==> val originalElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'replace' @ [272:48] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [272:56] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'createExpression' @ [272:67] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'aliasInstanceText' @ [272:84] ==> val aliasInstanceText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.replaceUsage[LocalVariableDescriptor]

'typeAlias' @ [277:9] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'getTypeReference' @ [277:19] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'forEachDescendantOfType' @ [277:40] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtTypeReference) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'it' @ [278:33] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.introduceTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'typeParameterInfo' @ [278:36] ==> private var KtTypeReference.typeParameterInfo: TypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[PropertyDescriptorImpl]

'psiFactory' @ [279:42] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'createType' @ [279:53] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [279:64] ==> val typeParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.introduceTypeParameters.<anonymous>[LocalVariableDescriptor]

'name' @ [279:78] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'it' @ [280:13] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.introduceTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [280:16] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'typeParameterReference' @ [280:24] ==> val typeParameterReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias.introduceTypeParameters.<anonymous>[LocalVariableDescriptor]

'if (previewOnly) {
        introduceTypeParameters()
        typeAlias
    }
    else {
        replaceUsage()
        introduceTypeParameters()
        insertDeclaration(typeAlias, originalData.targetSibling)
    }' @ [284:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeAlias, elseBranch: KtTypeAlias): KtTypeAlias[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeAlias

'previewOnly' @ [284:16] ==> value-parameter previewOnly: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[ValueParameterDescriptorImpl]

'introduceTypeParameters' @ [285:9] ==> local final fun introduceTypeParameters(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[SimpleFunctionDescriptorImpl]

'typeAlias' @ [286:9] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'replaceUsage' @ [289:9] ==> local final fun replaceUsage(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[SimpleFunctionDescriptorImpl]

'introduceTypeParameters' @ [290:9] ==> local final fun introduceTypeParameters(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[SimpleFunctionDescriptorImpl]

'insertDeclaration' @ [291:9] ==> public fun <T : KtDeclaration> insertDeclaration(declaration: KtTypeAlias, targetSibling: PsiElement): KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtTypeAlias

'typeAlias' @ [291:27] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.generateTypeAlias[LocalVariableDescriptor]

'originalData' @ [291:38] ==> public final val originalData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptor[PropertyDescriptorImpl]

'targetSibling' @ [291:51] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[PropertyDescriptorImpl]

