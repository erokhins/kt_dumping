'DeclarationDescriptorImpl' @ [34:5] ==> public constructor DeclarationDescriptorImpl(@NotNull annotations: Annotations, @NotNull name: Name) defined in org.jetbrains.kotlin.descriptors.impl.DeclarationDescriptorImpl[JavaClassConstructorDescriptor]

'EMPTY' @ [34:43] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'fqName' @ [34:50] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'shortNameOrSpecial' @ [34:57] ==> @NotNull public open fun shortNameOrSpecial(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'storageManager' @ [36:64] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [36:79] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<PackageFragmentDescriptor>): NotNullLazyValue<List<PackageFragmentDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<PackageFragmentDescriptor>

'module' @ [37:9] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'packageFragmentProvider' @ [37:16] ==> public final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[PropertyDescriptorImpl]

'getPackageFragments' @ [37:40] ==> public abstract fun getPackageFragments(fqName: FqName): List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [37:60] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'LazyScopeAdapter' @ [40:45] ==> public constructor LazyScopeAdapter(scope: NotNullLazyValue<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.LazyScopeAdapter[ClassConstructorDescriptorImpl]

'storageManager' @ [40:62] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [40:77] ==> public abstract fun <T : Any> createLazyValue(computable: () -> MemberScope): NotNullLazyValue<MemberScope> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> MemberScope

'if (fragments.isEmpty()) {
            MemberScope.Empty
        }
        else {
            // Packages from SubpackagesScope are got via getContributedDescriptors(DescriptorKindFilter.PACKAGES, MemberScope.ALL_NAME_FILTER)
            val scopes = fragments.map { it.getMemberScope() } + SubpackagesScope(module, fqName)
            ChainedMemberScope("package view scope for $fqName in ${module.name}", scopes)
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberScope, elseBranch: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberScope

'fragments' @ [41:13] ==> public open val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'isEmpty' @ [41:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Empty' @ [42:25] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'fragments' @ [46:26] ==> public open val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'map' @ [46:36] ==> public inline fun <T, R> Iterable<PackageFragmentDescriptor>.map(transform: (PackageFragmentDescriptor) -> MemberScope): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> MemberScope

'it' @ [46:42] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.memberScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getMemberScope' @ [46:45] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[SimpleFunctionDescriptorImpl]

'SubpackagesScope' @ [46:66] ==> public constructor SubpackagesScope(moduleDescriptor: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[ClassConstructorDescriptorImpl]

'module' @ [46:83] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'fqName' @ [46:91] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'ChainedMemberScope' @ [47:13] ==> public constructor ChainedMemberScope(debugName: String, scopes: List<MemberScope>) defined in org.jetbrains.kotlin.resolve.scopes.ChainedMemberScope[ClassConstructorDescriptorImpl]

'fqName' @ [47:57] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'module' @ [47:69] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'name' @ [47:76] ==> public final val ModuleDescriptorImpl.name: Name[MyPropertyDescriptor]

'scopes' @ [47:84] ==> val scopes: List<MemberScope> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.memberScope.<anonymous>[LocalVariableDescriptor]

'if (fqName.isRoot) null else module.getPackage(fqName.parent())' @ [52:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PackageViewDescriptor?, elseBranch: PackageViewDescriptor?): PackageViewDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PackageViewDescriptor?

'fqName' @ [52:20] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'isRoot' @ [52:27] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'module' @ [52:45] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'getPackage' @ [52:52] ==> public open fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]

'fqName' @ [52:63] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'parent' @ [52:70] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'other' @ [56:20] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.equals[ValueParameterDescriptorImpl]

'this' @ [57:16] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[LazyClassReceiverParameterDescriptor]

'fqName' @ [57:21] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'that' @ [57:31] ==> val that: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.equals[LocalVariableDescriptor]

'fqName' @ [57:36] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'this' @ [57:46] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[LazyClassReceiverParameterDescriptor]

'module' @ [57:51] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'that' @ [57:61] ==> val that: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.equals[LocalVariableDescriptor]

'module' @ [57:66] ==> public abstract val module: ModuleDescriptor defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'module' @ [61:22] ==> public open val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'hashCode' @ [61:29] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'result' @ [62:9] ==> var result: Int defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.hashCode[LocalVariableDescriptor]

'*' @ [62:18] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [62:23] ==> var result: Int defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.hashCode[LocalVariableDescriptor]

'fqName' @ [62:32] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[PropertyDescriptorImpl]

'hashCode' @ [62:39] ==> @Override public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'result' @ [63:16] ==> var result: Int defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.hashCode[LocalVariableDescriptor]

'visitor' @ [66:91] ==> value-parameter visitor: DeclarationDescriptorVisitor<R, D> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.accept[ValueParameterDescriptorImpl]

'visitPackageViewDescriptor' @ [66:99] ==> public abstract fun visitPackageViewDescriptor(descriptor: (PackageViewDescriptor..PackageViewDescriptor?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptorVisitor[JavaMethodDescriptor]

'this' @ [66:126] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl[LazyClassReceiverParameterDescriptor]

'data' @ [66:132] ==> value-parameter data: D defined in org.jetbrains.kotlin.descriptors.impl.LazyPackageViewDescriptorImpl.accept[ValueParameterDescriptorImpl]

