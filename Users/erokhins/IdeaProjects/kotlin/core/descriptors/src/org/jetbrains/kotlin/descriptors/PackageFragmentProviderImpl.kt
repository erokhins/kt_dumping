'packageFragments' @ [26:13] ==> private final val packageFragments: Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl[PropertyDescriptorImpl]

'filter' @ [26:30] ==> public inline fun <T> Iterable<PackageFragmentDescriptor>.filter(predicate: (PackageFragmentDescriptor) -> Boolean): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'it' @ [26:39] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getPackageFragments.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [26:42] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'fqName' @ [26:52] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getPackageFragments[ValueParameterDescriptorImpl]

'packageFragments' @ [29:13] ==> private final val packageFragments: Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl[PropertyDescriptorImpl]

'asSequence' @ [29:30] ==> public fun <T> Iterable<PackageFragmentDescriptor>.asSequence(): Sequence<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'map' @ [30:22] ==> public fun <T, R> Sequence<PackageFragmentDescriptor>.map(transform: (PackageFragmentDescriptor) -> FqName): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> FqName

'it' @ [30:28] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [30:31] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'filter' @ [31:22] ==> public fun <T> Sequence<FqName>.filter(predicate: (FqName) -> Boolean): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'!' @ [31:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [31:32] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'isRoot' @ [31:35] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'it' @ [31:45] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [31:48] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [31:60] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentProviderImpl.getSubPackagesOf[ValueParameterDescriptorImpl]

'toList' @ [32:22] ==> public fun <T> Sequence<FqName>.toList(): List<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

