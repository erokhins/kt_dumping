'PROJECT' @ [33:31] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [33:39] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [33:47] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.getTarget[ValueParameterDescriptorImpl]

'let' @ [33:61] ==> @InlineOnly public inline fun <T, R> Project.let(block: (Project) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project
    <R> -> PsiElement?

'getOverrideHierarchyElement' @ [34:13] ==> private final fun getOverrideHierarchyElement(element: PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider[SimpleFunctionDescriptorImpl]

'getCurrentElement' @ [34:41] ==> public fun getCurrentElement(dataContext: DataContext, project: Project): PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy in file HierarchyUtils.kt[SimpleFunctionDescriptorImpl]

'dataContext' @ [34:59] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.getTarget[ValueParameterDescriptorImpl]

'project' @ [34:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.getTarget.<anonymous>[ValueParameterDescriptorImpl]

'KotlinOverrideHierarchyBrowser' @ [39:13] ==> public constructor KotlinOverrideHierarchyBrowser(project: Project, baseElement: PsiElement) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyBrowser[ClassConstructorDescriptorImpl]

'target' @ [39:44] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.createHierarchyBrowser[ValueParameterDescriptorImpl]

'project' @ [39:51] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'target' @ [39:60] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.createHierarchyBrowser[ValueParameterDescriptorImpl]

'hierarchyBrowser' @ [42:10] ==> value-parameter hierarchyBrowser: HierarchyBrowser defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.browserActivated[ValueParameterDescriptorImpl]

'changeView' @ [42:54] ==> public final fun changeView(@NotNull p0: String): Unit defined in com.intellij.ide.hierarchy.HierarchyBrowserBaseEx[JavaMethodDescriptor]

'METHOD_TYPE' @ [42:92] ==> public const final val METHOD_TYPE: (String..String?) defined in com.intellij.ide.hierarchy.MethodHierarchyBrowserBase[JavaPropertyDescriptor]

'element' @ [46:15] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.getOverrideHierarchyElement[ValueParameterDescriptorImpl]

'getParentOfTypesAndPredicate' @ [46:24] ==> public fun <T : PsiElement> PsiElement.getParentOfTypesAndPredicate(strict: Boolean = ..., vararg parentClasses: Class<PsiElement>, predicate: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'it' @ [46:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyProvider.getOverrideHierarchyElement.<anonymous>[ValueParameterDescriptorImpl]

'isOverrideHierarchyElement' @ [46:58] ==> public fun PsiElement.isOverrideHierarchyElement(): Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides in file KotlinOverrideHierarchyProvider.kt[SimpleFunctionDescriptorImpl]

'this' @ [49:47] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.isOverrideHierarchyElement[ReceiverParameterDescriptorImpl]

'containingClassOrObject' @ [49:80] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

