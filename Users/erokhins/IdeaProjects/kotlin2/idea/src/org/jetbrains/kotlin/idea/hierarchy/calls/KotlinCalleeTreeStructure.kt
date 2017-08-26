'HierarchyTreeStructure' @ [38:5] ==> protected/*protected and package*/ constructor HierarchyTreeStructure(@NotNull p0: Project, p1: (HierarchyNodeDescriptor..HierarchyNodeDescriptor?)) defined in com.intellij.ide.hierarchy.HierarchyTreeStructure[JavaClassConstructorDescriptor]

'element' @ [38:28] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.<init>[ValueParameterDescriptorImpl]

'project' @ [38:36] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'KotlinCallHierarchyNodeDescriptor' @ [39:28] ==> public constructor KotlinCallHierarchyNodeDescriptor(@Nullable parentDescriptor: HierarchyNodeDescriptor?, @NotNull element: KtElement, isBase: Boolean, navigateToReference: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'element' @ [39:68] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.<init>[ValueParameterDescriptorImpl]

'when (this) {
            is KtNamedFunction, is KtFunctionLiteral, is KtPropertyAccessor -> listOf((this as KtDeclarationWithBody).bodyExpression)
            is KtProperty -> accessors.map { it.bodyExpression }
            is KtClassOrObject -> {
                superTypeListEntries.filterIsInstance<KtCallElement>() +
                getAnonymousInitializers().map { it.body } +
                declarations.filterIsInstance<KtProperty>().map { it.initializer }
            }
            else -> emptyList()
        }' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtElement?>, entry1: List<KtElement?>, entry2: List<KtElement?>, entry3: List<KtElement?>): List<KtElement?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtElement?>

'this' @ [41:22] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.getCalleeSearchScope[ReceiverParameterDescriptorImpl]

'listOf' @ [42:80] ==> public fun <T> listOf(element: KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'this' @ [42:88] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.getCalleeSearchScope[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [42:119] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'accessors' @ [43:30] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'map' @ [43:40] ==> public inline fun <T, R> Iterable<(KtPropertyAccessor..KtPropertyAccessor?)>.map(transform: ((KtPropertyAccessor..KtPropertyAccessor?)) -> KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)
    <R> -> KtExpression?

'it' @ [43:46] ==> value-parameter it: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.getCalleeSearchScope.<anonymous>[ValueParameterDescriptorImpl]

'bodyExpression' @ [43:49] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'superTypeListEntries' @ [45:17] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'filterIsInstance' @ [45:38] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtCallElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtCallElement

'getAnonymousInitializers' @ [46:17] ==> public final fun getAnonymousInitializers(): List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'map' @ [46:44] ==> public inline fun <T, R> Iterable<KtAnonymousInitializer>.map(transform: (KtAnonymousInitializer) -> KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer
    <R> -> KtExpression?

'it' @ [46:50] ==> value-parameter it: KtAnonymousInitializer defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.getCalleeSearchScope.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [46:53] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'declarations' @ [47:17] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [47:30] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtProperty

'map' @ [47:61] ==> public inline fun <T, R> Iterable<KtProperty>.map(transform: (KtProperty) -> KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <R> -> KtExpression?

'it' @ [47:67] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.getCalleeSearchScope.<anonymous>[ValueParameterDescriptorImpl]

'initializer' @ [47:70] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'emptyList' @ [49:21] ==> public fun <T> emptyList(): List<KtElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement?

'filterNotNull' @ [50:11] ==> public fun <T : Any> Iterable<KtElement?>.filterNotNull(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtElement

'nodeDescriptor' @ [54:13] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'nodeDescriptor' @ [55:29] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'enclosingElement' @ [55:44] ==> public final val CallHierarchyNodeDescriptor.enclosingElement: (PsiMember..PsiMember?)[MyPropertyDescriptor]

'EMPTY_OBJECT_ARRAY' @ [55:95] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'CalleeMethodsTreeStructure' @ [56:20] ==> public constructor CalleeMethodsTreeStructure(p0: (Project..Project?), p1: (PsiMethod..PsiMethod?), p2: (String..String?)) defined in com.intellij.ide.hierarchy.call.CalleeMethodsTreeStructure[JavaClassConstructorDescriptor]

'myProject' @ [56:47] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[JavaPropertyDescriptor]

'psiMethod' @ [56:58] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'scopeType' @ [56:69] ==> private final val scopeType: String defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[PropertyDescriptorImpl]

'getChildElements' @ [56:80] ==> public final fun getChildElements(p0: (Any..Any?)): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.ide.hierarchy.call.CalleeMethodsTreeStructure[JavaMethodDescriptor]

'nodeDescriptor' @ [56:97] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'nodeDescriptor' @ [59:23] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'psiElement' @ [59:38] ==> public final val HierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'EMPTY_OBJECT_ARRAY' @ [59:83] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'LinkedHashSet' @ [61:22] ==> public final fun <E> <init>(): LinkedHashSet<HierarchyNodeDescriptor> /* = LinkedHashSet<HierarchyNodeDescriptor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> HierarchyNodeDescriptor

'element' @ [62:26] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'containingClassOrObject' @ [62:54] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'HashMap' @ [63:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> NodeDescriptor<*>

'element' @ [65:9] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'getCalleeSearchScope' @ [65:17] ==> private final fun KtElement.getCalleeSearchScope(): List<KtElement> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[SimpleFunctionDescriptorImpl]

'forEach' @ [65:40] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [66:13] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [66:16] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'CalleeReferenceVisitorBase' @ [67:30] ==> protected/*protected and package*/ constructor CalleeReferenceVisitorBase(bindingContext: (BindingContext..BindingContext?), deepTraversal: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.CalleeReferenceVisitorBase[JavaClassConstructorDescriptor]

'it' @ [67:57] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [67:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'!' @ [69:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInScope' @ [69:34] ==> protected/*protected and package*/ open fun isInScope(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (String..String?)): Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[JavaMethodDescriptor]

'baseClass' @ [69:44] ==> val baseClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'declaration' @ [69:55] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren.<anonymous>.<no name provided>.processDeclaration[ValueParameterDescriptorImpl]

'scopeType' @ [69:68] ==> private final val scopeType: String defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[PropertyDescriptorImpl]

'result' @ [70:29] ==> val result: LinkedHashSet<HierarchyNodeDescriptor> /* = LinkedHashSet<HierarchyNodeDescriptor> */ defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'getOrCreateNodeDescriptor' @ [70:40] ==> internal fun getOrCreateNodeDescriptor(parent: HierarchyNodeDescriptor, originalElement: PsiElement, reference: PsiReference?, navigateToReference: Boolean, elementToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>>, isJavaMap: Boolean): HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.calls[SimpleFunctionDescriptorImpl]

'nodeDescriptor' @ [70:66] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'declaration' @ [70:82] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren.<anonymous>.<no name provided>.processDeclaration[ValueParameterDescriptorImpl]

'calleeToDescriptorMap' @ [70:108] ==> val calleeToDescriptorMap: HashMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'HierarchySearchRequest' @ [76:20] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtElement

'element' @ [76:43] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'element' @ [76:52] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'useScope' @ [76:60] ==> public final val KtElement.useScope: SearchScope[MyPropertyDescriptor]

'searchOverriders' @ [76:70] ==> public fun HierarchySearchRequest<*>.searchOverriders(): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'it' @ [77:29] ==> val it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'unwrapped' @ [77:32] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInScope' @ [78:18] ==> protected/*protected and package*/ open fun isInScope(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (String..String?)): Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[JavaMethodDescriptor]

'baseClass' @ [78:28] ==> val baseClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'overrider' @ [78:39] ==> val overrider: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'scopeType' @ [78:50] ==> private final val scopeType: String defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure[PropertyDescriptorImpl]

'result' @ [79:13] ==> val result: LinkedHashSet<HierarchyNodeDescriptor> /* = LinkedHashSet<HierarchyNodeDescriptor> */ defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'KotlinCallHierarchyNodeDescriptor' @ [79:23] ==> public constructor KotlinCallHierarchyNodeDescriptor(@Nullable parentDescriptor: HierarchyNodeDescriptor?, @NotNull element: KtElement, isBase: Boolean, navigateToReference: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'nodeDescriptor' @ [79:57] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'overrider' @ [79:73] ==> val overrider: KtElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'result' @ [82:16] ==> val result: LinkedHashSet<HierarchyNodeDescriptor> /* = LinkedHashSet<HierarchyNodeDescriptor> */ defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCalleeTreeStructure.buildChildren[LocalVariableDescriptor]

'toArray' @ [82:23] ==> public open fun toArray(): (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in java.util.LinkedHashSet[JavaMethodDescriptor]

