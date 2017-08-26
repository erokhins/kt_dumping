'getProperty' @ [28:38] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'toLowerCase' @ [28:61] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [28:75] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> OSKind): OSKind defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> OSKind

'when {
                // partly taken from http://www.code4copy.com/java/post/detecting-os-type-in-java
                it.startsWith("windows") -> Windows
                it.startsWith("mac os") -> OSX
                it.contains("unix") -> Unix
                it.startsWith("linux") -> Unix
                it.contains("bsd") -> Unix
                it.startsWith("irix") -> Unix
                it.startsWith("mpe/ix") -> Unix
                it.startsWith("aix") -> Unix
                it.startsWith("hp-ux") -> Unix
                it.startsWith("sunos") -> Unix
                it.startsWith("sun os") -> Unix
                it.startsWith("solaris") -> Unix
                else -> Unknown
            }' @ [29:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: OSKind, entry1: OSKind, entry2: OSKind, entry3: OSKind, entry4: OSKind, entry5: OSKind, entry6: OSKind, entry7: OSKind, entry8: OSKind, entry9: OSKind, entry10: OSKind, entry11: OSKind, entry12: OSKind): OSKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> OSKind

'it' @ [31:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [31:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Windows' @ [31:45] ==> enum entry Windows defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [32:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [32:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'OSX' @ [32:44] ==> enum entry OSX defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [33:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [33:20] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [33:40] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [34:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [34:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [34:43] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [35:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [35:20] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [35:39] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [36:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [36:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [36:42] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [37:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [37:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [37:44] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [38:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [38:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [38:41] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [39:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [39:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [39:43] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [40:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [40:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [40:43] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [41:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [41:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [41:44] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'it' @ [42:17] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion.current.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [42:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Unix' @ [42:45] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'Unknown' @ [43:25] ==> enum entry Unknown defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'if (this == null || this.isBlank()) v else this' @ [50:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.daemon.common.orDefault[ReceiverParameterDescriptorImpl]

'this' @ [50:25] ==> <this> defined in org.jetbrains.kotlin.daemon.common.orDefault[ReceiverParameterDescriptorImpl]

'isBlank' @ [50:30] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'v' @ [50:41] ==> value-parameter v: String defined in org.jetbrains.kotlin.daemon.common.orDefault[ValueParameterDescriptorImpl]

'this' @ [50:48] ==> <this> defined in org.jetbrains.kotlin.daemon.common.orDefault[ReceiverParameterDescriptorImpl]

'getProperty' @ [59:45] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'getProperty' @ [60:41] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'tempPath' @ [62:38] ==> public final val tempPath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'when (OSKind.current) {
        OSKind.Windows -> System.getenv("LOCALAPPDATA").orDefault(tempPath)
        OSKind.OSX -> userHomePath + "/Library/Application Support"
        OSKind.Unix -> System.getenv("XDG_DATA_HOME").orDefault(userHomePath + "/.local/share")
        OSKind.Unknown -> tempPath
    }' @ [64:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'OSKind' @ [64:57] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'current' @ [64:64] ==> public final val current: OSKind defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion[PropertyDescriptorImpl]

'OSKind' @ [65:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'Windows' @ [65:16] ==> enum entry Windows defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'getenv' @ [65:34] ==> public open fun getenv(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'orDefault' @ [65:57] ==> private fun String?.orDefault(v: String): String defined in org.jetbrains.kotlin.daemon.common in file FileSystemUtils.kt[SimpleFunctionDescriptorImpl]

'tempPath' @ [65:67] ==> public final val tempPath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'OSKind' @ [66:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'OSX' @ [66:16] ==> enum entry OSX defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'userHomePath' @ [66:23] ==> public final val userHomePath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'OSKind' @ [67:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'Unix' @ [67:16] ==> enum entry Unix defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'getenv' @ [67:31] ==> public open fun getenv(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'orDefault' @ [67:55] ==> private fun String?.orDefault(v: String): String defined in org.jetbrains.kotlin.daemon.common in file FileSystemUtils.kt[SimpleFunctionDescriptorImpl]

'userHomePath' @ [67:65] ==> public final val userHomePath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'OSKind' @ [68:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'Unknown' @ [68:16] ==> enum entry Unknown defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'tempPath' @ [68:27] ==> public final val tempPath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'assert' @ [72:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'names' @ [72:16] ==> value-parameter vararg names: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[ValueParameterDescriptorImpl]

'any' @ [72:22] ==> public fun <T> Array<out String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'File' @ [73:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'runtimeStateFilesBasePath' @ [73:25] ==> public final val runtimeStateFilesBasePath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'if (base.exists() && base.isDirectory) names.fold(base, ::File)
                  else names.drop(1)
                            .fold(File(userHomePath, names.first().let { if (it.startsWith(".")) it else ".$it" }), ::File)' @ [76:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'base' @ [76:23] ==> val base: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'exists' @ [76:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'base' @ [76:40] ==> val base: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'isDirectory' @ [76:45] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'names' @ [76:58] ==> value-parameter vararg names: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[ValueParameterDescriptorImpl]

'fold' @ [76:64] ==> public inline fun <T, R> Array<out String>.fold(initial: File, operation: (acc: File, String) -> File): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'base' @ [76:69] ==> val base: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'File' @ [76:77] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'names' @ [77:24] ==> value-parameter vararg names: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[ValueParameterDescriptorImpl]

'drop' @ [77:30] ==> public fun <T> Array<out String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fold' @ [78:30] ==> public inline fun <T, R> Iterable<String>.fold(initial: File, operation: (acc: File, String) -> File): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [78:35] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'userHomePath' @ [78:40] ==> public final val userHomePath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

'names' @ [78:54] ==> value-parameter vararg names: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[ValueParameterDescriptorImpl]

'first' @ [78:60] ==> public fun <T> Array<out String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [78:68] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.startsWith(".")) it else ".$it"' @ [78:74] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [78:78] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [78:81] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [78:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [78:109] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [78:119] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'if ((dir.exists() && dir.isDirectory) || dir.mkdirs()) dir.absolutePath
               else tempPath' @ [79:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'dir' @ [79:21] ==> val dir: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'exists' @ [79:25] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dir' @ [79:37] ==> val dir: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'isDirectory' @ [79:41] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'dir' @ [79:57] ==> val dir: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'mkdirs' @ [79:61] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dir' @ [79:71] ==> val dir: File defined in org.jetbrains.kotlin.daemon.common.FileSystem.getRuntimeStateFilesPath[LocalVariableDescriptor]

'absolutePath' @ [79:75] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'tempPath' @ [80:21] ==> public final val tempPath: String defined in org.jetbrains.kotlin.daemon.common.FileSystem[PropertyDescriptorImpl]

