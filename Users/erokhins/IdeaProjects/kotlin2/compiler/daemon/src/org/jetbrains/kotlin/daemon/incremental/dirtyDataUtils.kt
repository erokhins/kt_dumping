'dirtyClassesFqNames' @ [25:31] ==> public final val dirtyClassesFqNames: List<String> defined in org.jetbrains.kotlin.daemon.common.SimpleDirtyData[DeserializedPropertyDescriptor]

'map' @ [25:51] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'dirtyLookupSymbols' @ [26:30] ==> public final val dirtyLookupSymbols: List<String> defined in org.jetbrains.kotlin.daemon.common.SimpleDirtyData[DeserializedPropertyDescriptor]

'map' @ [26:49] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupSymbol): List<LookupSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupSymbol

'LookupSymbol' @ [27:9] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedClassConstructorDescriptor]

'it' @ [27:30] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.incremental.toDirtyData.<anonymous>[ValueParameterDescriptorImpl]

'substringBeforeLast' @ [27:33] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [27:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.incremental.toDirtyData.<anonymous>[ValueParameterDescriptorImpl]

'substringAfterLast' @ [27:69] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DirtyData' @ [29:12] ==> public constructor DirtyData(dirtyLookupSymbols: Collection<LookupSymbol> = ..., dirtyClassesFqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedClassConstructorDescriptor]

'dirtyLookupSymbols' @ [29:22] ==> val dirtyLookupSymbols: List<LookupSymbol> defined in org.jetbrains.kotlin.daemon.incremental.toDirtyData[LocalVariableDescriptor]

'dirtyClassesFqNames' @ [29:42] ==> val dirtyClassesFqNames: List<FqName> defined in org.jetbrains.kotlin.daemon.incremental.toDirtyData[LocalVariableDescriptor]

'SimpleDirtyData' @ [33:12] ==> public constructor SimpleDirtyData(dirtyLookupSymbols: List<String>, dirtyClassesFqNames: List<String>) defined in org.jetbrains.kotlin.daemon.common.SimpleDirtyData[DeserializedClassConstructorDescriptor]

'dirtyClassesFqNames' @ [33:50] ==> public final val dirtyClassesFqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedPropertyDescriptor]

'map' @ [33:70] ==> public inline fun <T, R> Iterable<FqName>.map(transform: (FqName) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> String

'dirtyLookupSymbols' @ [34:49] ==> public final val dirtyLookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedPropertyDescriptor]

'map' @ [34:68] ==> public inline fun <T, R> Iterable<LookupSymbol>.map(transform: (LookupSymbol) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol
    <R> -> String

'it' @ [34:77] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.daemon.incremental.toSimpleDirtyData.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [34:80] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedPropertyDescriptor]

'it' @ [34:89] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.daemon.incremental.toSimpleDirtyData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [34:92] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedPropertyDescriptor]

