'when (this) {
    is PsiMethod -> PsiUtil.canBeOverriden(this)
    is KtDeclaration -> isOverridable()
    else -> false
}' @ [52:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [52:56] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.isOverridableElement[ReceiverParameterDescriptorImpl]

'canBeOverriden' @ [53:29] ==> public open fun canBeOverriden(@NotNull p0: PsiMethod): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'this' @ [53:44] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.isOverridableElement[ReceiverParameterDescriptorImpl]

'isOverridable' @ [54:25] ==> public fun KtDeclaration.isOverridable(): Boolean defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'runReadAction' @ [59:22] ==> public fun <T> runReadAction(action: () -> List<PsiMethod>): List<PsiMethod> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PsiMethod>

'originalElement' @ [59:38] ==> public open val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'toLightMethods' @ [59:54] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'psiMethods' @ [60:9] ==> val psiMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchOverriders[LocalVariableDescriptor]

'isEmpty' @ [60:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getEmptyQuery' @ [60:49] ==> public open fun <T : (Any..Any?)> getEmptyQuery(): (Query<(PsiMethod..PsiMethod?)>..Query<(PsiMethod..PsiMethod?)>?) defined in com.intellij.util.EmptyQuery[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'psiMethods' @ [62:12] ==> val psiMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchOverriders[LocalVariableDescriptor]

'map' @ [63:14] ==> public inline fun <T, R> Iterable<PsiMethod>.map(transform: (PsiMethod) -> Query<PsiMethod>): List<Query<PsiMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Query<PsiMethod>

'KotlinPsiMethodOverridersSearch' @ [63:33] ==> public object KotlinPsiMethodOverridersSearch : HierarchySearch<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[FakeCallableDescriptorForObject]

'search' @ [63:65] ==> public final fun search(request: HierarchySearchRequest<PsiMethod>): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch[SimpleFunctionDescriptorImpl]

'copy' @ [63:72] ==> public final fun <U : PsiElement> copy(newOriginalElement: PsiMethod): HierarchySearchRequest<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[SimpleFunctionDescriptorImpl]
Inferred types:
    <U : PsiElement> -> PsiMethod

'psiMethod' @ [63:77] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchOverriders.<anonymous>[ValueParameterDescriptorImpl]

'reduce' @ [64:14] ==> public inline fun <S, T : Query<(PsiMethod..PsiMethod?)>> Iterable<Query<PsiMethod>>.reduce(operation: (acc: Query<(PsiMethod..PsiMethod?)>, Query<PsiMethod>) -> Query<(PsiMethod..PsiMethod?)>): Query<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Query<(com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)>
    <T : S> -> Query<PsiMethod>

'MergeQuery' @ [64:41] ==> public constructor MergeQuery<T : (Any..Any?)>(@NotNull p0: Query<out (PsiMethod..PsiMethod?)>, @NotNull p1: Query<out (PsiMethod..PsiMethod?)>) defined in com.intellij.util.MergeQuery[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'query1' @ [64:52] ==> value-parameter query1: Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchOverriders.<anonymous>[ValueParameterDescriptorImpl]

'query2' @ [64:60] ==> value-parameter query2: Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchOverriders.<anonymous>[ValueParameterDescriptorImpl]

'HierarchySearch<PsiMethod>' @ [67:42] ==> public constructor HierarchySearch<T : PsiElement>(traverser: HierarchyTraverser<PsiMethod>) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> PsiMethod

'PsiMethodOverridingHierarchyTraverser' @ [67:69] ==> public object PsiMethodOverridingHierarchyTraverser : HierarchyTraverser<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[FakeCallableDescriptorForObject]

'when {
                    hasModifierProperty(PsiModifier.STATIC) -> false
                    baseMethod.hasModifierProperty(PsiModifier.PACKAGE_LOCAL) ->
                        JavaPsiFacade.getInstance(project).arePackagesTheSame(baseClass, inheritor)
                    else -> true
                }' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'hasModifierProperty' @ [71:21] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'STATIC' @ [71:53] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'baseMethod' @ [72:21] ==> value-parameter baseMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.isAcceptable[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [72:32] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'PACKAGE_LOCAL' @ [72:64] ==> public const final val PACKAGE_LOCAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'getInstance' @ [73:39] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [73:51] ==> public final val PsiMethod.project: Project[MyPropertyDescriptor]

'arePackagesTheSame' @ [73:60] ==> public abstract fun arePackagesTheSame(@NotNull p0: PsiElement, @NotNull p1: PsiElement): Boolean defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'baseClass' @ [73:79] ==> value-parameter baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.isAcceptable[ValueParameterDescriptorImpl]

'inheritor' @ [73:90] ==> value-parameter inheritor: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.isAcceptable[ValueParameterDescriptorImpl]

'psiMethod' @ [77:24] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[ValueParameterDescriptorImpl]

'containingClass' @ [77:34] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'psiClass' @ [78:13] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'emptyList' @ [78:50] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(PsiMethod..PsiMethod?)>..List<(PsiMethod..PsiMethod?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'LinkedHashMap' @ [80:29] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiClass
    <V : (Any..Any?)> -> PsiMethod

'search' @ [83:49] ==> @NotNull @Deprecated public open fun search(@NotNull p0: PsiClass, @NotNull p1: SearchScope, p2: Boolean, p3: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.DirectClassInheritorsSearch[JavaMethodDescriptor]

'current' @ [84:29] ==> value-parameter current: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<no name provided>.nextElements[ValueParameterDescriptorImpl]

'current' @ [85:29] ==> value-parameter current: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<no name provided>.nextElements[ValueParameterDescriptorImpl]

'project' @ [85:37] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'allScope' @ [85:45] ==> public fun Project.allScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [91:21] ==> value-parameter element: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<no name provided>.shouldDescend[ValueParameterDescriptorImpl]

'isInheritable' @ [91:29] ==> public fun PsiClass.isInheritable(): Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file classInheritorsSearch.kt[SimpleFunctionDescriptorImpl]

'!' @ [91:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classToMethod' @ [91:49] ==> val classToMethod: LinkedHashMap<PsiClass, PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'containsKey' @ [91:63] ==> public open fun containsKey(key: PsiClass): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'element' @ [91:75] ==> value-parameter element: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<no name provided>.shouldDescend[ValueParameterDescriptorImpl]

'classTraverser' @ [94:9] ==> val classTraverser: <no name provided> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'forEach' @ [94:24] ==> public open fun forEach(initialElement: PsiClass, body: (PsiClass) -> Unit): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<no name provided>[SimpleFunctionDescriptorImpl]

'psiClass' @ [94:32] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'getSuperClassSubstitutor' @ [95:50] ==> @NotNull public open fun getSuperClassSubstitutor(@NotNull p0: PsiClass, @NotNull p1: PsiClass, @NotNull p2: PsiSubstitutor): PsiSubstitutor defined in com.intellij.psi.util.TypeConversionUtil[JavaMethodDescriptor]

'psiClass' @ [95:75] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'inheritor' @ [95:85] ==> value-parameter inheritor: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[ValueParameterDescriptorImpl]

'EMPTY' @ [95:111] ==> @NotNull public final val EMPTY: PsiSubstitutor defined in com.intellij.psi.PsiSubstitutor[JavaPropertyDescriptor]

'psiMethod' @ [96:29] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[ValueParameterDescriptorImpl]

'getSignature' @ [96:39] ==> @NotNull public abstract fun getSignature(@NotNull p0: PsiSubstitutor): MethodSignature defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'substitutor' @ [96:52] ==> val substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[LocalVariableDescriptor]

'findMethodBySuperSignature' @ [97:49] ==> @Nullable public open fun findMethodBySuperSignature(@NotNull p0: PsiClass, @NotNull p1: MethodSignature, p2: Boolean): PsiMethod? defined in com.intellij.psi.util.MethodSignatureUtil[JavaMethodDescriptor]

'inheritor' @ [97:76] ==> value-parameter inheritor: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [97:87] ==> val signature: MethodSignature defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[LocalVariableDescriptor]

'candidate' @ [98:17] ==> val candidate: PsiMethod? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[LocalVariableDescriptor]

'candidate' @ [98:38] ==> val candidate: PsiMethod? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[LocalVariableDescriptor]

'isAcceptable' @ [98:48] ==> local final fun PsiMethod.isAcceptable(inheritor: PsiClass, baseMethod: PsiMethod, baseClass: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[SimpleFunctionDescriptorImpl]

'inheritor' @ [98:61] ==> value-parameter inheritor: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[ValueParameterDescriptorImpl]

'psiMethod' @ [98:72] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[ValueParameterDescriptorImpl]

'psiClass' @ [98:83] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'classToMethod' @ [99:17] ==> val classToMethod: LinkedHashMap<PsiClass, PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'put' @ [99:31] ==> public open fun put(key: PsiClass, value: PsiMethod): PsiMethod? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'inheritor' @ [99:35] ==> value-parameter inheritor: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [99:46] ==> val candidate: PsiMethod? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders.<anonymous>[LocalVariableDescriptor]

'classToMethod' @ [103:16] ==> val classToMethod: LinkedHashMap<PsiClass, PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.searchDirectOverriders[LocalVariableDescriptor]

'values' @ [103:30] ==> public open val values: MutableCollection<PsiMethod> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'runReadAction' @ [107:13] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'request' @ [107:29] ==> value-parameter request: HierarchySearchRequest<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.isApplicable[ValueParameterDescriptorImpl]

'originalElement' @ [107:37] ==> public open val originalElement: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'isOverridableElement' @ [107:53] ==> public fun PsiElement.isOverridableElement(): Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[SimpleFunctionDescriptorImpl]

'searchDirectOverriders' @ [110:9] ==> public final fun searchDirectOverriders(psiMethod: PsiMethod): Iterable<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch[SimpleFunctionDescriptorImpl]

'request' @ [110:32] ==> value-parameter request: HierarchySearchRequest<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.doSearchDirect[ValueParameterDescriptorImpl]

'originalElement' @ [110:40] ==> public open val originalElement: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'forEach' @ [110:57] ==> @HidesMembers public inline fun <T> Iterable<PsiMethod>.forEach(action: (PsiMethod) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'consumer' @ [110:77] ==> value-parameter consumer: Processor<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.doSearchDirect[ValueParameterDescriptorImpl]

'process' @ [110:86] ==> public abstract fun process(p0: (PsiMethod..PsiMethod?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'method' @ [110:94] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch.doSearchDirect.<anonymous>[ValueParameterDescriptorImpl]

'KotlinPsiMethodOverridersSearch' @ [115:74] ==> public object KotlinPsiMethodOverridersSearch : HierarchySearch<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[FakeCallableDescriptorForObject]

'searchDirectOverriders' @ [115:106] ==> public final fun searchDirectOverriders(psiMethod: PsiMethod): Iterable<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.KotlinPsiMethodOverridersSearch[SimpleFunctionDescriptorImpl]

'current' @ [115:129] ==> value-parameter current: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.PsiMethodOverridingHierarchyTraverser.nextElements[ValueParameterDescriptorImpl]

'canBeOverriden' @ [116:71] ==> public open fun canBeOverriden(@NotNull p0: PsiMethod): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'element' @ [116:86] ==> value-parameter element: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.PsiMethodOverridingHierarchyTraverser.shouldDescend[ValueParameterDescriptorImpl]

'runReadAction' @ [125:31] ==> public fun <T> runReadAction(action: () -> ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor

'ktClass' @ [125:47] ==> value-parameter ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [125:55] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [126:27] ==> public fun <T> runReadAction(action: () -> List<CallableMemberDescriptor>): List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<CallableMemberDescriptor>

'members' @ [126:43] ==> value-parameter members: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[ValueParameterDescriptorImpl]

'mapNotNull' @ [126:51] ==> public inline fun <T, R : Any> Iterable<KtNamedDeclaration>.mapNotNull(transform: (KtNamedDeclaration) -> CallableMemberDescriptor?): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R : Any> -> CallableMemberDescriptor

'it' @ [126:64] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [126:67] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'filter' @ [126:120] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [126:129] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isOverridable' @ [126:132] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'baseDescriptors' @ [127:9] ==> val baseDescriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[LocalVariableDescriptor]

'isEmpty' @ [127:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'HierarchySearchRequest' @ [129:5] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtClass, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtClass

'ktClass' @ [129:28] ==> value-parameter ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[ValueParameterDescriptorImpl]

'scope' @ [129:37] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[ValueParameterDescriptorImpl]

'restrictToKotlinSources' @ [129:43] ==> public fun SearchScope.restrictToKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'searchInheritors' @ [129:76] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file classInheritorsSearch.kt[SimpleFunctionDescriptorImpl]

'forEach' @ [129:95] ==> @HidesMembers public inline fun <T> Iterable<(PsiClass..PsiClass?)>.forEach(action: ((PsiClass..PsiClass?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'?:' @ [130:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtClassOrObject?, right: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtClassOrObject

'it' @ [130:26] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [130:48] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'runReadAction' @ [131:35] ==> public fun <T> runReadAction(action: () -> ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor

'inheritor' @ [131:51] ==> val inheritor: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [131:61] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getTypeSubstitutor' @ [132:27] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'baseClassDescriptor' @ [132:46] ==> val baseClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[LocalVariableDescriptor]

'defaultType' @ [132:66] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'inheritorDescriptor' @ [132:79] ==> val inheritorDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [132:99] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'baseDescriptors' @ [133:9] ==> val baseDescriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride[LocalVariableDescriptor]

'forEach' @ [133:25] ==> @HidesMembers public inline fun <T> Iterable<CallableMemberDescriptor>.forEach(action: (CallableMemberDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [134:31] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [134:34] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [134:41] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'inheritorDescriptor' @ [135:40] ==> val inheritorDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>[LocalVariableDescriptor]

'findCallableMemberBySignature' @ [135:60] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'it' @ [135:90] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [135:93] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [135:104] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>[LocalVariableDescriptor]

'overridingDescriptor' @ [136:36] ==> val overridingDescriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[LocalVariableDescriptor]

'source' @ [136:58] ==> public final val CallableMemberDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [136:66] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'overridingMember' @ [137:17] ==> val overridingMember: PsiElement? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [138:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [138:22] ==> public abstract operator fun invoke(superMember: @ParameterName PsiElement, overridingMember: @ParameterName PsiElement): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'superMember' @ [138:32] ==> val superMember: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[LocalVariableDescriptor]

'overridingMember' @ [138:45] ==> val overridingMember: PsiElement? defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachKotlinOverride.<anonymous>.<anonymous>[LocalVariableDescriptor]

'runReadAction' @ [145:17] ==> public fun <T> runReadAction(action: () -> SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SearchScope

'useScope' @ [145:33] ==> public final val PsiMethod.useScope: SearchScope[MyPropertyDescriptor]

'search' @ [147:29] ==> public open fun search(@NotNull p0: PsiMethod, @NotNull p1: SearchScope, p2: Boolean): (Query<(PsiMethod..PsiMethod?)>..Query<(PsiMethod..PsiMethod?)>?) defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'this' @ [147:36] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[ReceiverParameterDescriptorImpl]

'scope' @ [147:42] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[LocalVariableDescriptor]

'excludeKotlinSources' @ [147:48] ==> public fun SearchScope.excludeKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'forEach' @ [147:78] ==> public final fun forEach(@NotNull p0: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in com.intellij.util.Query[MyFunctionDescriptor]

'processor' @ [147:86] ==> value-parameter processor: (PsiMethod) -> Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[ValueParameterDescriptorImpl]

'?:' @ [149:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNamedDeclaration?, right: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNamedDeclaration

'this' @ [149:21] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [149:46] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'runReadAction' @ [150:19] ==> public fun <T> runReadAction(action: () -> KtClass?): KtClass? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtClass?

'ktMember' @ [150:35] ==> val ktMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[LocalVariableDescriptor]

'containingClassOrObject' @ [150:44] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'forEachKotlinOverride' @ [151:5] ==> private fun forEachKotlinOverride(ktClass: KtClass, members: List<KtNamedDeclaration>, scope: SearchScope, processor: (superMember: PsiElement, overridingMember: PsiElement) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[SimpleFunctionDescriptorImpl]

'ktClass' @ [151:27] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[LocalVariableDescriptor]

'listOf' @ [151:36] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'ktMember' @ [151:43] ==> val ktMember: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[LocalVariableDescriptor]

'scope' @ [151:54] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod[LocalVariableDescriptor]

'runReadAction' @ [152:28] ==> public fun <T> runReadAction(action: () -> List<PsiMethod>): List<PsiMethod> defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PsiMethod>

'overrider' @ [152:44] ==> value-parameter overrider: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [152:54] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'lightMethods' @ [153:9] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod.<anonymous>[LocalVariableDescriptor]

'all' @ [153:22] ==> public inline fun <T> Iterable<PsiMethod>.all(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'invoke' @ [153:28] ==> public abstract operator fun invoke(p1: PsiMethod): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [153:38] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachOverridingMethod.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runReadAction' @ [158:17] ==> public fun <T> runReadAction(action: () -> SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SearchScope

'useScope' @ [158:33] ==> public final val PsiClass.useScope: SearchScope[MyPropertyDescriptor]

'search' @ [160:32] ==> @NotNull public open fun search(@NotNull p0: PsiClass, @NotNull p1: SearchScope): Query<(Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>..Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>?)> defined in com.intellij.psi.search.searches.AllOverridingMethodsSearch[JavaMethodDescriptor]

'this' @ [160:39] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[ReceiverParameterDescriptorImpl]

'scope' @ [160:45] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'excludeKotlinSources' @ [160:51] ==> public fun SearchScope.excludeKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'all' @ [160:75] ==> public inline fun <T> Iterable<(Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>..Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>?)>.all(predicate: ((Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>..Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.Pair<(com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?), (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)>..com.intellij.openapi.util.Pair<(com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?), (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)>?)

'invoke' @ [160:81] ==> public abstract operator fun invoke(superMember: @ParameterName PsiElement, overridingMember: @ParameterName PsiElement): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [160:91] ==> value-parameter it: (Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>..Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>?) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [160:94] ==> public final val first: (PsiMethod..PsiMethod?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'it' @ [160:101] ==> value-parameter it: (Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>..Pair<(PsiMethod..PsiMethod?), (PsiMethod..PsiMethod?)>?) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [160:104] ==> public final val second: (PsiMethod..PsiMethod?) defined in com.intellij.openapi.util.Pair[JavaPropertyDescriptor]

'?:' @ [162:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtClass?, right: KtClass): KtClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtClass

'this' @ [162:20] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [162:44] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'ktClass' @ [163:19] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'declarations' @ [163:27] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [163:40] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'ktClass' @ [164:19] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'primaryConstructorParameters' @ [164:27] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'filter' @ [164:56] ==> public inline fun <T> Iterable<KtParameter>.filter(predicate: (KtParameter) -> Boolean): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'it' @ [164:65] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [164:68] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'forEachKotlinOverride' @ [165:5] ==> private fun forEachKotlinOverride(ktClass: KtClass, members: List<KtNamedDeclaration>, scope: SearchScope, processor: (superMember: PsiElement, overridingMember: PsiElement) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch in file overridersSearch.kt[SimpleFunctionDescriptorImpl]

'ktClass' @ [165:27] ==> val ktClass: KtClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'members' @ [165:36] ==> val members: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'scope' @ [165:45] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[LocalVariableDescriptor]

'processor' @ [165:52] ==> value-parameter processor: (superMember: PsiElement, overridingMember: PsiElement) -> Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.forEachDeclaredMemberOverride[ValueParameterDescriptorImpl]

