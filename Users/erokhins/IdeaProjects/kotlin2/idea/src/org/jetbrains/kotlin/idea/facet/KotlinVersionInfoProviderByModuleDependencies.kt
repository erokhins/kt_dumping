'bundledRuntimeVersion' @ [30:55] ==> public fun bundledRuntimeVersion(): String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'when (targetPlatform) {
            is TargetPlatformKind.JavaScript -> JsLibraryStdDetectionUtil::getJsLibraryStdVersion
            is TargetPlatformKind.Jvm -> JavaRuntimeDetectionUtil::getJavaRuntimeVersion
            is TargetPlatformKind.Common -> return emptyList()
        }' @ [33:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Library) -> String?, entry1: (Library) -> String?, entry2: (Library) -> String?): (Library) -> String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Function1<Library, String?>

'targetPlatform' @ [33:59] ==> value-parameter targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProviderByModuleDependencies.getLibraryVersions[ValueParameterDescriptorImpl]

'JsLibraryStdDetectionUtil' @ [34:49] ==> public object JsLibraryStdDetectionUtil defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'getJsLibraryStdVersion' @ [34:76] ==> public final fun getJsLibraryStdVersion(library: Library): String? defined in org.jetbrains.kotlin.idea.framework.JsLibraryStdDetectionUtil[DeserializedSimpleFunctionDescriptor]

'JavaRuntimeDetectionUtil' @ [35:42] ==> public constructor JavaRuntimeDetectionUtil() defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaClassConstructorDescriptor]

'getJavaRuntimeVersion' @ [35:68] ==> public open fun getJavaRuntimeVersion(@NotNull p0: Library): (String..String?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaMethodDescriptor]

'emptyList' @ [36:52] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'rootModel' @ [38:17] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProviderByModuleDependencies.getLibraryVersions[ValueParameterDescriptorImpl]

'getInstance' @ [38:48] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [38:60] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProviderByModuleDependencies.getLibraryVersions[ValueParameterDescriptorImpl]

'orderEntries' @ [39:18] ==> public final val ModuleRootModel.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'asSequence' @ [40:18] ==> public fun <T> Array<out (OrderEntry..OrderEntry?)>.asSequence(): Sequence<(OrderEntry..OrderEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.OrderEntry..com.intellij.openapi.roots.OrderEntry?)

'filterIsInstance' @ [41:18] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<LibraryOrderEntry> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LibraryOrderEntry

'mapNotNull' @ [42:18] ==> public fun <T, R : Any> Sequence<LibraryOrderEntry>.mapNotNull(transform: (LibraryOrderEntry) -> String?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryOrderEntry
    <R : Any> -> String

'it' @ [42:31] ==> value-parameter it: LibraryOrderEntry defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProviderByModuleDependencies.getLibraryVersions.<anonymous>[ValueParameterDescriptorImpl]

'library' @ [42:34] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'let' @ [42:43] ==> @InlineOnly public inline fun <T, R> Library.let(block: (Library) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library
    <R> -> String?

'invoke' @ [42:49] ==> public abstract operator fun invoke(p1: Library): String? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [42:65] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProviderByModuleDependencies.getLibraryVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [43:18] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

