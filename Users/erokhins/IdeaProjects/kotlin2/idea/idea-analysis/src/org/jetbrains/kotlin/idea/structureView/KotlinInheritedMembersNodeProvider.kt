'InheritedMembersNodeProvider<TreeElement>' @ [30:43] ==> public constructor InheritedMembersNodeProvider<T : (TreeElement..TreeElement?)>() defined in com.intellij.ide.util.InheritedMembersNodeProvider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (TreeElement..TreeElement?)> -> TreeElement

'node' @ [32:13] ==> value-parameter node: TreeElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[ValueParameterDescriptorImpl]

'listOf' @ [32:57] ==> @InlineOnly public inline fun <T> listOf(): List<TreeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'node' @ [34:23] ==> value-parameter node: TreeElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[ValueParameterDescriptorImpl]

'element' @ [34:28] ==> public final val element: NavigatablePsiElement defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewElement[PropertyDescriptorImpl]

'element' @ [35:13] ==> val element: NavigatablePsiElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'listOf' @ [35:49] ==> @InlineOnly public inline fun <T> listOf(): List<TreeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'element' @ [37:23] ==> val element: NavigatablePsiElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'project' @ [37:31] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'element' @ [39:23] ==> val element: NavigatablePsiElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'analyze' @ [39:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [40:26] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [40:49] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [40:76] ==> val element: NavigatablePsiElement defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'descriptor' @ [42:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'listOf' @ [42:57] ==> @InlineOnly public inline fun <T> listOf(): List<TreeElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeElement

'ArrayList' @ [44:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TreeElement

'descriptor' @ [46:27] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'defaultType' @ [46:38] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'defaultType' @ [47:34] ==> val defaultType: SimpleType defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'memberScope' @ [47:46] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [47:58] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'memberDescriptor' @ [48:17] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'when (memberDescriptor.kind) {
                CallableMemberDescriptor.Kind.FAKE_OVERRIDE,
                CallableMemberDescriptor.Kind.DELEGATION -> {
                    val superTypeMember = DescriptorToSourceUtilsIde.getAnyDeclaration(project, memberDescriptor)
                    if (superTypeMember is NavigatablePsiElement) {
                        children.add(KotlinStructureViewElement(superTypeMember, memberDescriptor, true))
                    }
                }
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'memberDescriptor' @ [50:19] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'kind' @ [50:36] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [51:47] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DELEGATION' @ [52:47] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DescriptorToSourceUtilsIde' @ [53:43] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [53:70] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [53:88] ==> val project: Project defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'memberDescriptor' @ [53:97] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'superTypeMember' @ [54:25] ==> val superTypeMember: PsiElement? defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'children' @ [55:25] ==> val children: ArrayList<TreeElement> defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'add' @ [55:34] ==> public open fun add(element: TreeElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'KotlinStructureViewElement' @ [55:38] ==> public constructor KotlinStructureViewElement(element: NavigatablePsiElement, descriptor: DeclarationDescriptor, isInherited: Boolean) defined in org.jetbrains.kotlin.idea.structureView.KotlinStructureViewElement[ClassConstructorDescriptorImpl]

'superTypeMember' @ [55:65] ==> val superTypeMember: PsiElement? defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'memberDescriptor' @ [55:82] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

'children' @ [61:16] ==> val children: ArrayList<TreeElement> defined in org.jetbrains.kotlin.idea.structureView.KotlinInheritedMembersNodeProvider.provideNodes[LocalVariableDescriptor]

