'AbstractProtoComparisonTest<ProtoData>' @ [42:48] ==> public constructor AbstractProtoComparisonTest<PROTO_DATA>() defined in org.jetbrains.kotlin.jps.incremental.AbstractProtoComparisonTest[ClassConstructorDescriptorImpl]
Inferred types:
    <PROTO_DATA> -> ProtoData

'File' @ [44:9] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDir' @ [44:14] ==> value-parameter testDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.expectedOutputFile[ValueParameterDescriptorImpl]

'takeIf' @ [45:18] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [45:27] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.expectedOutputFile.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [45:30] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'super' @ [46:20] ==> <this> defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest[LazyClassReceiverParameterDescriptor]

'expectedOutputFile' @ [46:26] ==> protected open fun expectedOutputFile(testDir: File): File defined in org.jetbrains.kotlin.jps.incremental.AbstractProtoComparisonTest[SimpleFunctionDescriptorImpl]

'testDir' @ [46:45] ==> value-parameter testDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.expectedOutputFile[ValueParameterDescriptorImpl]

'IncrementalResultsConsumerImpl' @ [49:34] ==> public constructor IncrementalResultsConsumerImpl() defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedClassConstructorDescriptor]

'Services' @ [50:24] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'Builder' @ [50:33] ==> public constructor Builder() defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedClassConstructorDescriptor]

'run' @ [50:43] ==> @InlineOnly public inline fun <T, R> Services.Builder.run(block: Services.Builder.() -> Services): Services defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Builder
    <R> -> Services

'register' @ [51:13] ==> public final fun <T : Any> register(interfaceClass: Class<IncrementalResultsConsumer>, implementation: IncrementalResultsConsumer): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalResultsConsumer

'java' @ [51:56] ==> public val <T> KClass<IncrementalResultsConsumer>.java: Class<IncrementalResultsConsumer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumer

'incrementalResults' @ [51:62] ==> val incrementalResults: IncrementalResultsConsumerImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'build' @ [52:13] ==> public final fun build(): Services defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]

'sourceDir' @ [55:23] ==> value-parameter sourceDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[ValueParameterDescriptorImpl]

'walkMatching' @ [55:33] ==> protected final fun File.walkMatching(predicate: (File) -> Boolean): Sequence<File> defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest[SimpleFunctionDescriptorImpl]

'it' @ [55:48] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [55:51] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [55:56] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [55:74] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> (String..String?)): Sequence<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [55:80] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [55:83] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'toList' @ [55:99] ==> public fun <T> Sequence<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'TestMessageCollector' @ [56:32] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.incremental.utils.TestMessageCollector[DeserializedClassConstructorDescriptor]

'OutputItemsCollectorImpl' @ [57:36] ==> public constructor OutputItemsCollectorImpl() defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollectorImpl[JavaClassConstructorDescriptor]

'K2JSCompilerArguments' @ [58:20] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [58:44] ==> @InlineOnly public inline fun <T> K2JSCompilerArguments.apply(block: K2JSCompilerArguments.() -> Unit): K2JSCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JSCompilerArguments

'outputFile' @ [59:13] ==> @GradleOption @Argument public final var outputFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'File' @ [59:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [59:31] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[ValueParameterDescriptorImpl]

'canonicalPath' @ [59:52] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'metaInfo' @ [60:13] ==> @GradleOption @Argument public final var metaInfo: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'main' @ [61:13] ==> @GradleOption @Argument public final var main: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'NO_CALL' @ [61:42] ==> public const final val NO_CALL: String defined in org.jetbrains.kotlin.cli.common.arguments.K2JsArgumentConstants[JavaPropertyDescriptor]

'freeArgs' @ [62:13] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'addAll' @ [62:22] ==> public abstract fun addAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [62:29] ==> val ktFiles: List<(String..String?)> defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'createTestingCompilerEnvironment' @ [65:19] ==> public fun createTestingCompilerEnvironment(messageCollector: MessageCollector, outputItemsCollector: OutputItemsCollectorImpl, services: Services): JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental in file compilerUtils.kt[SimpleFunctionDescriptorImpl]

'messageCollector' @ [65:52] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'outputItemsCollector' @ [65:70] ==> val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'services' @ [65:92] ==> val services: Services defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'runJSCompiler' @ [66:9] ==> public fun runJSCompiler(args: K2JSCompilerArguments, env: JpsCompilerEnvironment): ExitCode? defined in org.jetbrains.kotlin.jps.incremental in file compilerUtils.kt[SimpleFunctionDescriptorImpl]

'args' @ [66:23] ==> val args: K2JSCompilerArguments defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'env' @ [66:29] ==> val env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'let' @ [66:34] ==> @InlineOnly public inline fun <T, R> ExitCode?.let(block: (ExitCode?) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExitCode?
    <R> -> Unit

'listOf' @ [68:33] ==> public fun <T> listOf(element: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'exitCode' @ [68:40] ==> value-parameter exitCode: ExitCode? defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [68:50] ==> public final val name: String defined in org.jetbrains.kotlin.cli.common.ExitCode[DeserializedPropertyDescriptor]

'messageCollector' @ [68:58] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'errors' @ [68:75] ==> public final val errors: ArrayList<String> defined in org.jetbrains.kotlin.incremental.utils.TestMessageCollector[DeserializedPropertyDescriptor]

'joinToString' @ [68:83] ==> public fun <T> Iterable<String?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'assertEquals' @ [69:20] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expectedOutput' @ [69:33] ==> val expectedOutput: String defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[LocalVariableDescriptor]

'actualOutput' @ [69:49] ==> val actualOutput: String defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[LocalVariableDescriptor]

'hashMapOf' @ [72:23] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<ClassId, ProtoData> /* = HashMap<ClassId, ProtoData> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassId
    <V> -> ProtoData

'component1' @ [74:15] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedSimpleFunctionDescriptor]

'component2' @ [74:27] ==> public final operator fun component2(): ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedSimpleFunctionDescriptor]

'component3' @ [74:39] ==> public final operator fun component3(): ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedSimpleFunctionDescriptor]

'incrementalResults' @ [74:45] ==> val incrementalResults: IncrementalResultsConsumerImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'packageParts' @ [74:64] ==> public final val packageParts: List<IncrementalResultsConsumerImpl.PackagePartData> defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedPropertyDescriptor]

'parseFrom' @ [75:50] ==> public open fun parseFrom(p0: (ByteArray..ByteArray?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'protoBytes' @ [75:60] ==> val protoBytes: ByteArray defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'extensionRegistry' @ [75:93] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'NameResolverImpl' @ [76:32] ==> public constructor NameResolverImpl(strings: ProtoBuf.StringTable, qualifiedNames: ProtoBuf.QualifiedNameTable) defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedClassConstructorDescriptor]

'proto' @ [76:49] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'strings' @ [76:55] ==> public final val ProtoBuf.PackageFragment.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'proto' @ [76:64] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'qualifiedNames' @ [76:70] ==> public final val ProtoBuf.PackageFragment.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'proto' @ [78:13] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'class_List' @ [78:19] ==> public final val ProtoBuf.PackageFragment.class_List: (MutableList<(ProtoBuf.Class..ProtoBuf.Class?)>..List<(ProtoBuf.Class..ProtoBuf.Class?)>?)[MyPropertyDescriptor]

'forEach' @ [78:30] ==> @HidesMembers public inline fun <T> Iterable<(ProtoBuf.Class..ProtoBuf.Class?)>.forEach(action: ((ProtoBuf.Class..ProtoBuf.Class?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class..org.jetbrains.kotlin.serialization.ProtoBuf.Class?)

'nameResolver' @ [79:31] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'getClassId' @ [79:44] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [79:55] ==> value-parameter it: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [79:58] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'classes' @ [80:17] ==> val classes: HashMap<ClassId, ProtoData> /* = HashMap<ClassId, ProtoData> */ defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'classId' @ [80:25] ==> val classId: ClassId defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[LocalVariableDescriptor]

'ClassProtoData' @ [80:36] ==> public constructor ClassProtoData(proto: ProtoBuf.Class, nameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.ClassProtoData[DeserializedClassConstructorDescriptor]

'it' @ [80:51] ==> value-parameter it: (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [80:55] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'proto' @ [83:13] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'`package`' @ [83:19] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'apply' @ [83:29] ==> @InlineOnly public inline fun <T> (ProtoBuf.Package..ProtoBuf.Package?).apply(block: (ProtoBuf.Package..ProtoBuf.Package?).() -> Unit): (ProtoBuf.Package..ProtoBuf.Package?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Package..org.jetbrains.kotlin.serialization.ProtoBuf.Package?)

'if (hasExtension(JsProtoBuf.packageFqName)) {
                    nameResolver.getPackageFqName(getExtension(JsProtoBuf.packageFqName))
                }
                else FqName.ROOT' @ [84:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (FqName..FqName?), elseBranch: (FqName..FqName?)): (FqName..FqName?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'hasExtension' @ [84:41] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'packageFqName' @ [84:65] ==> public final val packageFqName: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'nameResolver' @ [85:21] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'getPackageFqName' @ [85:34] ==> public final fun getPackageFqName(index: Int): FqName defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'getExtension' @ [85:51] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?)): (Int..Int?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'packageFqName' @ [85:75] ==> public final val packageFqName: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'ROOT' @ [87:29] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'ClassId' @ [89:42] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'packageFqName' @ [89:50] ==> val packageFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[LocalVariableDescriptor]

'identifier' @ [89:70] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'sourceFile' @ [89:81] ==> val sourceFile: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'nameWithoutExtension' @ [89:92] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'capitalize' @ [89:113] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classes' @ [90:17] ==> val classes: HashMap<ClassId, ProtoData> /* = HashMap<ClassId, ProtoData> */ defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'packagePartClassId' @ [90:25] ==> val packagePartClassId: ClassId defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[LocalVariableDescriptor]

'PackagePartProtoData' @ [90:47] ==> public constructor PackagePartProtoData(proto: ProtoBuf.Package, nameResolver: NameResolver) defined in org.jetbrains.kotlin.incremental.PackagePartProtoData[DeserializedClassConstructorDescriptor]

'this' @ [90:68] ==> <this> defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses.<anonymous>[ReceiverParameterDescriptorImpl]

'nameResolver' @ [90:74] ==> val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'classes' @ [94:16] ==> val classes: HashMap<ClassId, ProtoData> /* = HashMap<ClassId, ProtoData> */ defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'differenceImpl' @ [98:13] ==> public fun difference(oldData: ProtoData, newData: ProtoData): Difference defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'oldData' @ [98:28] ==> value-parameter oldData: ProtoData defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.difference[ValueParameterDescriptorImpl]

'newData' @ [98:37] ==> value-parameter newData: ProtoData defined in org.jetbrains.kotlin.jps.incremental.AbstractJsProtoComparisonTest.difference[ValueParameterDescriptorImpl]

