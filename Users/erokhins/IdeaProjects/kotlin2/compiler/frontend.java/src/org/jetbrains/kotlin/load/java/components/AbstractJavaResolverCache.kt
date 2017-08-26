'resolveSession' @ [29:47] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache[PropertyDescriptorImpl]

'trace' @ [29:62] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'trace' @ [32:16] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache[PropertyDescriptorImpl]

'get' @ [32:22] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(FqNameUnsafe..FqNameUnsafe?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(FqNameUnsafe..FqNameUnsafe?), (ClassDescriptor..ClassDescriptor?)>?), p1: (FqNameUnsafe..FqNameUnsafe?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.name.FqNameUnsafe..org.jetbrains.kotlin.name.FqNameUnsafe?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'FQNAME_TO_CLASS_DESCRIPTOR' @ [32:41] ==> public final val FQNAME_TO_CLASS_DESCRIPTOR: (WritableSlice<(FqNameUnsafe..FqNameUnsafe?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(FqNameUnsafe..FqNameUnsafe?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'fqName' @ [32:69] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.getClassResolvedFromSource[ValueParameterDescriptorImpl]

'toUnsafe' @ [32:76] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'findInPackageFragments' @ [32:91] ==> private final fun findInPackageFragments(fullFqName: FqName): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache[SimpleFunctionDescriptorImpl]

'fqName' @ [32:114] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.getClassResolvedFromSource[ValueParameterDescriptorImpl]

'if (fullFqName.isRoot) fullFqName else fullFqName.parent()' @ [36:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'fullFqName' @ [36:26] ==> value-parameter fullFqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[ValueParameterDescriptorImpl]

'isRoot' @ [36:37] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'fullFqName' @ [36:45] ==> value-parameter fullFqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[ValueParameterDescriptorImpl]

'fullFqName' @ [36:61] ==> value-parameter fullFqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[ValueParameterDescriptorImpl]

'parent' @ [36:72] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'resolveSession' @ [39:37] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache[PropertyDescriptorImpl]

'getPackageFragment' @ [39:52] ==> @Nullable public open fun getPackageFragment(@NotNull fqName: FqName): LazyPackageDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'fqName' @ [39:71] ==> var fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'packageDescriptor' @ [40:17] ==> val packageDescriptor: LazyPackageDescriptor? defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'findClassByRelativePath' @ [41:50] ==> @Nullable public open fun findClassByRelativePath(@NotNull p0: MemberScope, @NotNull p1: FqName): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.ResolveSessionUtils[JavaMethodDescriptor]

'packageDescriptor' @ [41:74] ==> val packageDescriptor: LazyPackageDescriptor? defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'getMemberScope' @ [41:92] ==> @NotNull public open fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyPackageDescriptor[JavaMethodDescriptor]

'fullFqName' @ [41:110] ==> value-parameter fullFqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[ValueParameterDescriptorImpl]

'tail' @ [41:121] ==> public fun FqName.tail(prefix: FqName): FqName defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'fqName' @ [41:126] ==> var fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'result' @ [42:21] ==> val result: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'result' @ [42:44] ==> val result: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'fqName' @ [45:17] ==> var fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'isRoot' @ [45:24] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'fqName' @ [46:13] ==> var fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'fqName' @ [46:22] ==> var fqName: FqName defined in org.jetbrains.kotlin.load.java.components.AbstractJavaResolverCache.findInPackageFragments[LocalVariableDescriptor]

'parent' @ [46:29] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

