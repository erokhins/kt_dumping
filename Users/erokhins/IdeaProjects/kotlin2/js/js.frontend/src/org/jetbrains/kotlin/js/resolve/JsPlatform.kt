'TargetPlatform' @ [28:21] ==> public constructor TargetPlatform(platformName: String) defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedClassConstructorDescriptor]

'LockBasedStorageManager' @ [29:34] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'createMemoizedFunction' @ [29:60] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createMemoizedFunction(@NotNull compute: (Boolean) -> List<ImportPath>): MemoizedFunctionToNotNull<(Boolean..Boolean?), (List<ImportPath>..List<ImportPath>?)> defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Boolean
    <V : (Any..Any?)> -> List<ImportPath>

'Default' @ [30:13] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

'getDefaultImports' @ [30:21] ==> public open fun getDefaultImports(includeKotlinComparisons: Boolean): List<ImportPath> defined in org.jetbrains.kotlin.resolve.TargetPlatform.Default[DeserializedSimpleFunctionDescriptor]

'includeKotlinComparisons' @ [30:39] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.js.resolve.JsPlatform.defaultImports.<anonymous>[ValueParameterDescriptorImpl]

'fromString' @ [30:78] ==> @JvmStatic public final fun fromString(pathStr: String): ImportPath defined in org.jetbrains.kotlin.resolve.ImportPath.Companion[DeserializedSimpleFunctionDescriptor]

'invoke' @ [33:91] ==> public abstract fun invoke(p1: (Boolean..Boolean?)): (List<ImportPath>..List<ImportPath>?) defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'includeKotlinComparisons' @ [33:106] ==> value-parameter includeKotlinComparisons: Boolean defined in org.jetbrains.kotlin.js.resolve.JsPlatform.getDefaultImports[ValueParameterDescriptorImpl]

'JsPlatformConfigurator' @ [35:63] ==> public object JsPlatformConfigurator : PlatformConfigurator defined in org.jetbrains.kotlin.js.resolve in file JsPlatformConfigurator.kt[FakeCallableDescriptorForObject]

'DefaultBuiltIns' @ [38:17] ==> public companion object defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns[FakeCallableDescriptorForObject]

'Instance' @ [38:33] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'MultiTargetPlatform' @ [40:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Specific' @ [40:60] ==> public constructor Specific(platform: String) defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedClassConstructorDescriptor]

'platformName' @ [40:69] ==> public final val platformName: String defined in org.jetbrains.kotlin.js.resolve.JsPlatform[DeserializedPropertyDescriptor]

'listOf' @ [42:50] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [42:136] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [42:142] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'it' @ [42:161] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.resolve.JsPlatform.excludedImports.<anonymous>[ValueParameterDescriptorImpl]

