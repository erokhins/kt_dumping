'AbstractIncrementalJpsTest' @ [24:39] ==> public constructor AbstractIncrementalJpsTest(allowNoFilesWithSuffixInTestData: Boolean = ..., checkDumpsCaseInsensitively: Boolean = ..., allowNoBuildLogFileInTestData: Boolean = ...) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[ClassConstructorDescriptorImpl]

'doTest' @ [26:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'doTest' @ [30:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'doTest' @ [34:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'doTest' @ [38:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'doTest' @ [42:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'doTest' @ [46:9] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[SimpleFunctionDescriptorImpl]

'when {
                            ownerClassName == "JavaClass" && fieldName == "CONST" -> listOf(File(workDir, "src/usage.kt"))
                            ownerClassName == "test.Klass" && fieldName == "CONST" -> listOf(File(workDir, "src/Usage.java"))
                            else -> emptyList()
                        }' @ [61:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<File>, entry1: List<File>, entry2: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<File>

'ownerClassName' @ [62:29] ==> value-parameter ownerClassName: String? defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest.<get-mockConstantSearch>.<no name provided>.request[ValueParameterDescriptorImpl]

'fieldName' @ [62:62] ==> value-parameter fieldName: String? defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest.<get-mockConstantSearch>.<no name provided>.request[ValueParameterDescriptorImpl]

'listOf' @ [62:86] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [62:93] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [62:98] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[PropertyDescriptorImpl]

'ownerClassName' @ [63:29] ==> value-parameter ownerClassName: String? defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest.<get-mockConstantSearch>.<no name provided>.request[ValueParameterDescriptorImpl]

'fieldName' @ [63:63] ==> value-parameter fieldName: String? defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest.<get-mockConstantSearch>.<no name provided>.request[ValueParameterDescriptorImpl]

'listOf' @ [63:87] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [63:94] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [63:99] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest[PropertyDescriptorImpl]

'emptyList' @ [64:37] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'FixedFuture' @ [67:24] ==> public constructor FixedFuture<T : (Any..Any?)>(p0: (Callbacks.ConstantAffection..Callbacks.ConstantAffection?)) defined in com.intellij.util.concurrency.FixedFuture[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConstantAffection

'ConstantAffection' @ [67:46] ==> public constructor ConstantAffection(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?)) defined in org.jetbrains.jps.builders.java.dependencyView.Callbacks.ConstantAffection[JavaClassConstructorDescriptor]

'affectedFiles' @ [67:64] ==> val affectedFiles: List<File> defined in org.jetbrains.kotlin.jps.build.IncrementalConstantSearchTest.<get-mockConstantSearch>.<no name provided>.request[LocalVariableDescriptor]

