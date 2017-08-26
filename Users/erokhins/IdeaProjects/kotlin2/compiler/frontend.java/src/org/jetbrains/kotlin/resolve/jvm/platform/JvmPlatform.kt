'TargetPlatform' @ [26:22] ==> public constructor TargetPlatform(platformName: String) defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedClassConstructorDescriptor]

'LockBasedStorageManager' @ [27:34] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'createMemoizedFunction' @ [27:60] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createMemoizedFunction(@NotNull compute: (Boolean) -> List<ImportPath>): MemoizedFunctionToNotNull<(Boolean..Boolean?), (List<ImportPath>..List<ImportPath>?)> defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Boolean
    <V : (Any..Any?)> -> List<ImportPath>

'ArrayList' @ [28:9] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ImportPath

'apply' @ [28:33] ==> @InlineOnly public inline fun <T> ArrayList<ImportPath>.apply(block: ArrayList<ImportPath>.() -> Unit): ArrayList<ImportPath> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ImportPath>

'addAll' @ [29:13] ==> public open fun addAll(elements: Collection<ImportPath>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getDefaultImports' @ [29:28] ==> public open fun getDefaultImports(includeKotlinComparisons: Boolean): List<ImportPath> defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default[DeserializedSimpleFunctionDescriptor]

'includeKotlinComparisons' @ [29:46] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.defaultImports.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [31:13] ==> public open fun add(element: ImportPath): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'fromString' @ [31:28] ==> @JvmStatic public final fun fromString(pathStr: String): ImportPath defined in org.jetbrains.kotlin.resolve.ImportPath.Companion[DeserializedSimpleFunctionDescriptor]

'add' @ [32:13] ==> public open fun add(element: ImportPath): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'fromString' @ [32:28] ==> @JvmStatic public final fun fromString(pathStr: String): ImportPath defined in org.jetbrains.kotlin.resolve.ImportPath.Companion[DeserializedSimpleFunctionDescriptor]

'scope' @ [35:36] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.defaultImports.<anonymous>.<anonymous>.addAllClassifiersFromScope[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [35:42] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'CLASSIFIERS' @ [35:89] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'ALL_NAME_FILTER' @ [35:114] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'add' @ [36:21] ==> public open fun add(element: ImportPath): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ImportPath' @ [36:25] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'getFqNameSafe' @ [36:52] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [36:66] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.defaultImports.<anonymous>.<anonymous>.addAllClassifiersFromScope[LocalVariableDescriptor]

'JvmBuiltIns' @ [40:44] ==> @JvmOverloads public constructor JvmBuiltIns(storageManager: StorageManager, loadBuiltInsFromCurrentClassLoader: Boolean = ...) defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedClassConstructorDescriptor]

'NO_LOCKS' @ [40:80] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'builtInsPackageFragmentsImportedByDefault' @ [40:90] ==> public final val JvmBuiltIns.builtInsPackageFragmentsImportedByDefault: (MutableSet<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>..Set<(PackageFragmentDescriptor..PackageFragmentDescriptor?)>)[MyPropertyDescriptor]

'addAllClassifiersFromScope' @ [41:17] ==> local final fun addAllClassifiersFromScope(scope: MemberScope): Unit defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.defaultImports.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'builtinPackageFragment' @ [41:44] ==> val builtinPackageFragment: (PackageFragmentDescriptor..PackageFragmentDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.defaultImports.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getMemberScope' @ [41:67] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'invoke' @ [47:91] ==> public abstract fun invoke(p1: (Boolean..Boolean?)): (List<ImportPath>..List<ImportPath>?) defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'includeKotlinComparisons' @ [47:106] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform.getDefaultImports[ValueParameterDescriptorImpl]

'JvmPlatformConfigurator' @ [49:63] ==> public object JvmPlatformConfigurator : PlatformConfigurator defined in org.jetbrains.kotlin.resolve.jvm.platform in file JvmPlatformConfigurator.kt[FakeCallableDescriptorForObject]

'MultiTargetPlatform' @ [51:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Specific' @ [51:60] ==> public constructor Specific(platform: String) defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedClassConstructorDescriptor]

'platformName' @ [51:69] ==> public final val platformName: String defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform[DeserializedPropertyDescriptor]

