'TestCaseWithTmpdir' @ [28:28] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'if (SystemInfo.isWindows) "$executableName.bat" else executableName' @ [37:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isWindows' @ [37:49] ==> public const final val isWindows: Boolean defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'executableName' @ [37:62] ==> value-parameter executableName: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'executableName' @ [37:87] ==> value-parameter executableName: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'File' @ [38:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'PathUtil' @ [38:33] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForDistDirectory' @ [38:42] ==> @JvmStatic public final val kotlinPathsForDistDirectory: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'homePath' @ [38:70] ==> public final val KotlinPaths.homePath: File[MyPropertyDescriptor]

'executableFileName' @ [38:86] ==> val executableFileName: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'assertTrue' @ [39:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'launcherFile' @ [39:66] ==> val launcherFile: File defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'absolutePath' @ [39:79] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'launcherFile' @ [39:95] ==> val launcherFile: File defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'exists' @ [39:108] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'GeneralCommandLine' @ [41:19] ==> public constructor GeneralCommandLine(@NotNull vararg p0: (String..String?)) defined in com.intellij.execution.configurations.GeneralCommandLine[JavaClassConstructorDescriptor]

'launcherFile' @ [41:38] ==> val launcherFile: File defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'absolutePath' @ [41:51] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'args' @ [41:66] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'workDirectory' @ [42:9] ==> value-parameter workDirectory: File? = ... defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'let' @ [42:24] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> GeneralCommandLine): GeneralCommandLine defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> GeneralCommandLine

'cmd' @ [42:28] ==> val cmd: GeneralCommandLine defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'execAndGetOutput' @ [43:38] ==> @NotNull public open fun execAndGetOutput(@NotNull p0: GeneralCommandLine): ProcessOutput defined in com.intellij.execution.util.ExecUtil[JavaMethodDescriptor]

'cmd' @ [43:55] ==> val cmd: GeneralCommandLine defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'convertLineSeparators' @ [44:33] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'processOutput' @ [44:55] ==> val processOutput: ProcessOutput defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'stdout' @ [44:69] ==> public final val ProcessOutput.stdout: String[MyPropertyDescriptor]

'convertLineSeparators' @ [45:33] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'processOutput' @ [45:55] ==> val processOutput: ProcessOutput defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'stderr' @ [45:69] ==> public final val ProcessOutput.stderr: String[MyPropertyDescriptor]

'processOutput' @ [46:24] ==> val processOutput: ProcessOutput defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'exitCode' @ [46:38] ==> public final var ProcessOutput.exitCode: Int[MyPropertyDescriptor]

'assertEquals' @ [49:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'expectedStdout' @ [49:26] ==> value-parameter expectedStdout: String = ... defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'stdout' @ [49:42] ==> val stdout: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'assertEquals' @ [50:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'expectedStderr' @ [50:26] ==> value-parameter expectedStderr: String = ... defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'stderr' @ [50:42] ==> val stderr: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'assertEquals' @ [51:13] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'expectedExitCode' @ [51:26] ==> value-parameter expectedExitCode: Int = ... defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[ValueParameterDescriptorImpl]

'exitCode' @ [51:44] ==> val exitCode: Int defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'err' @ [54:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [54:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'exitCode' @ [54:44] ==> val exitCode: Int defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'err' @ [55:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [55:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'err' @ [56:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [56:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'stdout' @ [56:32] ==> val stdout: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'err' @ [57:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [57:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'err' @ [58:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [58:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'stderr' @ [58:32] ==> val stderr: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'e' @ [59:19] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.LauncherScriptTest.runProcess[LocalVariableDescriptor]

'+' @ [64:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [64:33] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'runProcess' @ [67:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'testDataDirectory' @ [69:19] ==> private final val testDataDirectory: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest[PropertyDescriptorImpl]

'tmpdir' @ [70:23] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [70:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [75:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'testDataDirectory' @ [77:19] ==> private final val testDataDirectory: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest[PropertyDescriptorImpl]

'tmpdir' @ [78:23] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [78:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [83:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'testDataDirectory' @ [85:19] ==> private final val testDataDirectory: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest[PropertyDescriptorImpl]

'File' @ [87:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [87:33] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [87:51] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [92:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'testDataDirectory' @ [94:19] ==> private final val testDataDirectory: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest[PropertyDescriptorImpl]

'tmpdir' @ [95:23] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [95:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [98:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [100:24] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [100:31] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [108:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'testDataDirectory' @ [110:19] ==> private final val testDataDirectory: String defined in org.jetbrains.kotlin.cli.LauncherScriptTest[PropertyDescriptorImpl]

'tmpdir' @ [111:23] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'path' @ [111:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'runProcess' @ [114:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [114:96] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

'tmpDirForTest' @ [116:40] ==> @NotNull public open fun tmpDirForTest(p0: (TestCase..TestCase?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [116:54] ==> <this> defined in org.jetbrains.kotlin.cli.LauncherScriptTest[LazyClassReceiverParameterDescriptor]

'runProcess' @ [117:9] ==> private final fun runProcess(executableName: String, vararg args: String, expectedStdout: String = ..., expectedStderr: String = ..., expectedExitCode: Int = ..., workDirectory: File? = ...): Unit defined in org.jetbrains.kotlin.cli.LauncherScriptTest[SimpleFunctionDescriptorImpl]

'emptyDir' @ [119:24] ==> val emptyDir: File defined in org.jetbrains.kotlin.cli.LauncherScriptTest.testDoNotAppendCurrentDirToNonEmptyClasspath[LocalVariableDescriptor]

'path' @ [119:33] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [123:33] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.cli.LauncherScriptTest[JavaPropertyDescriptor]

