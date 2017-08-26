'ArrayList' @ [29:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PackageFragmentDescriptor

'providers' @ [30:26] ==> private final val providers: List<PackageFragmentProvider> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[PropertyDescriptorImpl]

'result' @ [31:13] ==> val result: ArrayList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getPackageFragments[LocalVariableDescriptor]

'addAll' @ [31:20] ==> public open fun addAll(elements: Collection<PackageFragmentDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'provider' @ [31:27] ==> val provider: PackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getPackageFragments[LocalVariableDescriptor]

'getPackageFragments' @ [31:36] ==> public abstract fun getPackageFragments(fqName: FqName): List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [31:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'result' @ [33:16] ==> val result: ArrayList<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getPackageFragments[LocalVariableDescriptor]

'toList' @ [33:23] ==> public fun <T> Iterable<PackageFragmentDescriptor>.toList(): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'HashSet' @ [37:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'providers' @ [38:26] ==> private final val providers: List<PackageFragmentProvider> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[PropertyDescriptorImpl]

'result' @ [39:13] ==> val result: HashSet<FqName> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getSubPackagesOf[LocalVariableDescriptor]

'addAll' @ [39:20] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'provider' @ [39:27] ==> val provider: PackageFragmentProvider defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getSubPackagesOf[LocalVariableDescriptor]

'getSubPackagesOf' @ [39:36] ==> public abstract fun getSubPackagesOf(fqName: FqName, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [39:53] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'nameFilter' @ [39:61] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'result' @ [41:16] ==> val result: HashSet<FqName> defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider.getSubPackagesOf[LocalVariableDescriptor]

