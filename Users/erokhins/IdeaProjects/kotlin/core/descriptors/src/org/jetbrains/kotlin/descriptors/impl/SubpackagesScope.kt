'MemberScopeImpl' @ [31:107] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[ClassConstructorDescriptorImpl]

'name' @ [34:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getPackage[ValueParameterDescriptorImpl]

'isSpecial' @ [34:18] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'moduleDescriptor' @ [37:37] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[PropertyDescriptorImpl]

'getPackage' @ [37:54] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'fqName' @ [37:65] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[PropertyDescriptorImpl]

'child' @ [37:72] ==> @NotNull public open fun child(@NotNull name: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [37:78] ==> value-parameter name: Name defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getPackage[ValueParameterDescriptorImpl]

'packageViewDescriptor' @ [38:13] ==> val packageViewDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getPackage[LocalVariableDescriptor]

'isEmpty' @ [38:35] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[SimpleFunctionDescriptorImpl]

'packageViewDescriptor' @ [41:16] ==> val packageViewDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getPackage[LocalVariableDescriptor]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [46:14] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [46:25] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [46:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'PACKAGES_MASK' @ [46:59] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'listOf' @ [46:82] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'fqName' @ [47:13] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[PropertyDescriptorImpl]

'isRoot' @ [47:20] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'kindFilter' @ [47:30] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'excludes' @ [47:41] ==> public final val excludes: List<DescriptorKindExclude> defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'contains' @ [47:50] ==> public abstract fun contains(element: DescriptorKindExclude): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'TopLevelPackages' @ [47:81] ==> public object TopLevelPackages : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'listOf' @ [47:107] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'moduleDescriptor' @ [49:26] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[PropertyDescriptorImpl]

'getSubPackagesOf' @ [49:43] ==> public abstract fun getSubPackagesOf(fqName: FqName, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'fqName' @ [49:60] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[PropertyDescriptorImpl]

'nameFilter' @ [49:68] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'ArrayList' @ [50:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'subFqNames' @ [50:55] ==> val subFqNames: Collection<FqName> defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'size' @ [50:66] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'subFqNames' @ [51:27] ==> val subFqNames: Collection<FqName> defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'subFqName' @ [52:29] ==> val subFqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'shortName' @ [52:39] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'invoke' @ [53:17] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'shortName' @ [53:28] ==> val shortName: Name defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'result' @ [54:17] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [54:24] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'getPackage' @ [54:37] ==> protected final fun getPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[SimpleFunctionDescriptorImpl]

'shortName' @ [54:48] ==> val shortName: Name defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'result' @ [57:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.getContributedDescriptors[LocalVariableDescriptor]

'p' @ [61:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [61:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [61:19] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope[LazyClassReceiverParameterDescriptor]

'java' @ [61:31] ==> public val <T> KClass<out SubpackagesScope>.java: Class<out SubpackagesScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SubpackagesScope

'simpleName' @ [61:36] ==> public final val <T : (Any..Any?)> Class<out SubpackagesScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SubpackagesScope

'p' @ [62:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [62:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [64:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [64:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [65:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.descriptors.impl.SubpackagesScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [65:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

