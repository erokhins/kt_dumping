'StructureViewModelBase' @ [26:67] ==> public constructor StructureViewModelBase(@NotNull p0: PsiFile, @Nullable p1: Editor?, @NotNull p2: StructureViewTreeElement) defined in com.intellij.ide.structureView.StructureViewModelBase[JavaClassConstructorDescriptor]

'ktFile' @ [26:90] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel.<init>[ValueParameterDescriptorImpl]

'editor' @ [26:98] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel.<init>[ValueParameterDescriptorImpl]

'KotlinStructureViewElement' @ [26:106] ==> public constructor KotlinStructureViewElement(element: NavigatablePsiElement, isInherited: Boolean = ...) defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewElement[ClassConstructorDescriptorImpl]

'ktFile' @ [26:133] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel.<init>[ValueParameterDescriptorImpl]

'withSuitableClasses' @ [29:9] ==> @NotNull public open fun withSuitableClasses(@NotNull vararg p0: raw (Class<(Any..Any?)>..Class<*>?)): StructureViewModelBase defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel[JavaMethodDescriptor]

'java' @ [29:50] ==> public val <T> KClass<KtDeclaration>.java: Class<KtDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclaration

'withSorters' @ [30:9] ==> @NotNull public open fun withSorters(@NotNull vararg p0: (Sorter..Sorter?)): StructureViewModelBase defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel[JavaMethodDescriptor]

'ALPHA_SORTER' @ [30:28] ==> public final val ALPHA_SORTER: (Sorter..Sorter?) defined in com.intellij.ide.util.treeView.smartTree.Sorter[JavaPropertyDescriptor]

'NODE_PROVIDERS' @ [33:39] ==> private final val NODE_PROVIDERS: List<KotlinInheritedMembersNodeProvider> defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel.Companion[PropertyDescriptorImpl]

'FILTERS' @ [35:33] ==> private final val FILTERS: Array<Filter> defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewModel.Companion[PropertyDescriptorImpl]

'listOf' @ [38:38] ==> public fun <T> listOf(element: KotlinInheritedMembersNodeProvider): List<KotlinInheritedMembersNodeProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinInheritedMembersNodeProvider

'KotlinInheritedMembersNodeProvider' @ [38:45] ==> public constructor KotlinInheritedMembersNodeProvider() defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider[ClassConstructorDescriptorImpl]

'arrayOf' @ [39:31] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Filter): Array<Filter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Filter

'PublicElementsFilter' @ [39:47] ==> public object PublicElementsFilter : Filter defined in org.jetbrains.kotlin.idea.structureView in file KotlinStructureViewModel.kt[FakeCallableDescriptorForObject]

'?:' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'treeNode' @ [45:17] ==> value-parameter treeNode: TreeElement defined in org.jetbrains.kotlin.idea.structureView.PublicElementsFilter.isVisible[ValueParameterDescriptorImpl]

'isPublic' @ [45:59] ==> public final val isPublic: Boolean defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewElement[PropertyDescriptorImpl]

'ActionPresentationData' @ [49:16] ==> public constructor ActionPresentationData(@NotNull p0: String, p1: (String..String?), p2: (Icon..Icon?)) defined in com.intellij.ide.util.treeView.smartTree.ActionPresentationData[JavaClassConstructorDescriptor]

'PRIVATE_ICON' @ [49:78] ==> public final val PRIVATE_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'ID' @ [52:30] ==> public const final val ID: String defined in org.jetbrains.kotlin.idea.structureView.PublicElementsFilter[PropertyDescriptorImpl]

