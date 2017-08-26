'HierarchyTreeStructure' @ [31:91] ==> protected/*protected and package*/ constructor HierarchyTreeStructure(@NotNull p0: Project, p1: (HierarchyNodeDescriptor..HierarchyNodeDescriptor?)) defined in com.intellij.ide.hierarchy.HierarchyTreeStructure[JavaClassConstructorDescriptor]

'project' @ [31:114] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.<init>[ValueParameterDescriptorImpl]

'setBaseElement' @ [33:9] ==> protected/*protected and package*/ final fun setBaseElement(@NotNull p0: HierarchyNodeDescriptor): Unit defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure[JavaMethodDescriptor]

'KotlinOverrideHierarchyNodeDescriptor' @ [33:24] ==> public constructor KotlinOverrideHierarchyNodeDescriptor(parentNode: HierarchyNodeDescriptor?, klass: PsiElement, baseElement: PsiElement) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[ClassConstructorDescriptorImpl]

'declaration' @ [33:68] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.<init>[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [33:80] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'declaration' @ [33:107] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.<init>[ValueParameterDescriptorImpl]

'declaration' @ [36:31] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.<init>[ValueParameterDescriptorImpl]

'createSmartPointer' @ [36:43] ==> public fun <E : PsiElement> KtCallableDeclaration.createSmartPointer(): SmartPsiElementPointer<KtCallableDeclaration> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtCallableDeclaration

'baseElement' @ [39:27] ==> private final val baseElement: SmartPsiElementPointer<KtCallableDeclaration> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure[PropertyDescriptorImpl]

'element' @ [39:39] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtCallableDeclaration>.element: KtCallableDeclaration?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtCallableDeclaration

'EMPTY_OBJECT_ARRAY' @ [39:67] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'nodeDescriptor' @ [40:26] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'psiElement' @ [40:41] ==> public final val HierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'EMPTY_OBJECT_ARRAY' @ [40:72] ==> public final val EMPTY_OBJECT_ARRAY: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'HierarchySearchRequest' @ [41:26] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'psiElement' @ [41:49] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[LocalVariableDescriptor]

'psiElement' @ [41:61] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[LocalVariableDescriptor]

'useScope' @ [41:72] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'searchInheritors' @ [41:89] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'findAll' @ [41:108] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'subclasses' @ [42:16] ==> val subclasses: (MutableCollection<(PsiClass..PsiClass?)>..Collection<(PsiClass..PsiClass?)>) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[LocalVariableDescriptor]

'mapNotNull' @ [43:18] ==> public inline fun <T, R : Any> Iterable<(PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> KotlinOverrideHierarchyNodeDescriptor?): List<KotlinOverrideHierarchyNodeDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> KotlinOverrideHierarchyNodeDescriptor

'it' @ [44:36] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [44:39] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'KotlinOverrideHierarchyNodeDescriptor' @ [45:21] ==> public constructor KotlinOverrideHierarchyNodeDescriptor(parentNode: HierarchyNodeDescriptor?, klass: PsiElement, baseElement: PsiElement) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[ClassConstructorDescriptorImpl]

'nodeDescriptor' @ [45:59] ==> value-parameter nodeDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[ValueParameterDescriptorImpl]

'subclass' @ [45:75] ==> val subclass: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren.<anonymous>[LocalVariableDescriptor]

'baseElement' @ [45:85] ==> val baseElement: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren[LocalVariableDescriptor]

'filter' @ [47:18] ==> public inline fun <T> Iterable<KotlinOverrideHierarchyNodeDescriptor>.filter(predicate: (KotlinOverrideHierarchyNodeDescriptor) -> Boolean): List<KotlinOverrideHierarchyNodeDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinOverrideHierarchyNodeDescriptor

'it' @ [47:27] ==> value-parameter it: KotlinOverrideHierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideTreeStructure.buildChildren.<anonymous>[ValueParameterDescriptorImpl]

'calculateState' @ [47:30] ==> internal final fun calculateState(): Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'MethodNotDefined' @ [47:69] ==> public final val MethodNotDefined: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'toTypedArray' @ [48:18] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

