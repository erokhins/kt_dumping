'obtainInlineInfo' @ [34:26] ==> private final fun obtainInlineInfo(files: Iterable<OutputFile>): InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'outputFiles' @ [34:43] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'inlineInfo' @ [35:29] ==> val inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'inlineMethods' @ [35:40] ==> public final val inlineMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.InlineInfo[PropertyDescriptorImpl]

'assert' @ [36:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [36:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inlineMethods' @ [36:17] ==> val inlineMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'isEmpty' @ [36:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'checkInlineMethodNotInvoked' @ [38:31] ==> private final fun checkInlineMethodNotInvoked(files: Iterable<OutputFile>, inlinedMethods: Set<InlineTestUtil.MethodInfo>): List<InlineTestUtil.NotInlinedCall> defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'outputFiles' @ [38:59] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'inlineMethods' @ [38:72] ==> val inlineMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'assert' @ [39:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notInlinedCalls' @ [39:16] ==> val notInlinedCalls: List<InlineTestUtil.NotInlinedCall> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'isEmpty' @ [39:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'+' @ [39:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'notInlinedCalls' @ [39:93] ==> val notInlinedCalls: List<InlineTestUtil.NotInlinedCall> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'joinToString' @ [39:109] ==> public fun <T> Iterable<InlineTestUtil.NotInlinedCall>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((InlineTestUtil.NotInlinedCall) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotInlinedCall

'sourceFiles' @ [41:37] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'any' @ [41:49] ==> public inline fun <T> Iterable<KtFile>.any(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'isDirectiveDefined' @ [42:35] ==> public open fun isDirectiveDefined(fileText: (String..String?), directive: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'it' @ [42:54] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [42:57] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'!' @ [43:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doLambdaInliningCheck' @ [43:15] ==> private final fun doLambdaInliningCheck(files: Iterable<OutputFile>, inlineInfo: InlineTestUtil.InlineInfo): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'outputFiles' @ [43:37] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'inlineInfo' @ [43:50] ==> val inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'!' @ [45:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipParameterChecking' @ [45:14] ==> val skipParameterChecking: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'checkParametersInlined' @ [46:40] ==> private final fun checkParametersInlined(outputFiles: Iterable<OutputFile>, inlineInfo: InlineTestUtil.InlineInfo, sourceFiles: List<KtFile>): ArrayList<InlineTestUtil.NotInlinedParameter> defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'outputFiles' @ [46:63] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'inlineInfo' @ [46:76] ==> val inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'sourceFiles' @ [46:88] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[ValueParameterDescriptorImpl]

'assert' @ [47:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notInlinedParameters' @ [47:20] ==> val notInlinedParameters: ArrayList<InlineTestUtil.NotInlinedParameter> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'isEmpty' @ [47:41] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'+' @ [48:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'notInlinedParameters' @ [48:66] ==> val notInlinedParameters: ArrayList<InlineTestUtil.NotInlinedParameter> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkNoCallsToInline[LocalVariableDescriptor]

'joinToString' @ [48:87] ==> public fun <T> Iterable<InlineTestUtil.NotInlinedParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((InlineTestUtil.NotInlinedParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotInlinedParameter

'HashSet' @ [55:29] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MethodInfo

'hashMapOf' @ [56:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, KotlinJvmBinaryClass> /* = HashMap<String, KotlinJvmBinaryClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KotlinJvmBinaryClass

'files' @ [57:22] ==> value-parameter files: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[ValueParameterDescriptorImpl]

'loadBinaryClass' @ [58:31] ==> private final fun loadBinaryClass(file: OutputFile): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'file' @ [58:47] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'inlineFunctionsJvmNames' @ [59:35] ==> public fun inlineFunctionsJvmNames(header: KotlinClassHeader): Set<String> defined in org.jetbrains.kotlin.inline[DeserializedSimpleFunctionDescriptor]

'binaryClass' @ [59:59] ==> val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'classHeader' @ [59:71] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'ClassVisitorWithName' @ [61:41] ==> public constructor ClassVisitorWithName() defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[ClassConstructorDescriptorImpl]

'name' @ [63:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [63:32] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'inlineFunctions' @ [63:40] ==> val inlineFunctions: Set<String> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'inlineMethods' @ [64:25] ==> val inlineMethods: HashSet<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'add' @ [64:39] ==> public open fun add(element: InlineTestUtil.MethodInfo): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'MethodInfo' @ [64:43] ==> public constructor MethodInfo(owner: String, name: String, desc: String) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[ClassConstructorDescriptorImpl]

'className' @ [64:54] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>[PropertyDescriptorImpl]

'name' @ [64:65] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [64:71] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'ClassReader' @ [70:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [70:25] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'asByteArray' @ [70:30] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [70:45] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'classVisitor' @ [70:52] ==> val classVisitor: <no name provided> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'binaryClasses' @ [71:13] ==> val binaryClasses: HashMap<String, KotlinJvmBinaryClass> /* = HashMap<String, KotlinJvmBinaryClass> */ defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'put' @ [71:27] ==> public open fun put(key: String, value: KotlinJvmBinaryClass): KotlinJvmBinaryClass? defined in java.util.HashMap[JavaMethodDescriptor]

'classVisitor' @ [71:31] ==> val classVisitor: <no name provided> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'className' @ [71:44] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo.<no name provided>[PropertyDescriptorImpl]

'binaryClass' @ [71:55] ==> val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'InlineInfo' @ [74:16] ==> public constructor InlineInfo(inlineMethods: Set<InlineTestUtil.MethodInfo>, binaryClasses: Map<String, KotlinJvmBinaryClass>) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.InlineInfo[ClassConstructorDescriptorImpl]

'inlineMethods' @ [74:27] ==> val inlineMethods: HashSet<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'binaryClasses' @ [74:42] ==> val binaryClasses: HashMap<String, KotlinJvmBinaryClass> /* = HashMap<String, KotlinJvmBinaryClass> */ defined in org.jetbrains.kotlin.codegen.InlineTestUtil.obtainInlineInfo[LocalVariableDescriptor]

'files' @ [79:22] ==> value-parameter files: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[ValueParameterDescriptorImpl]

'loadBinaryClass' @ [80:31] ==> private final fun loadBinaryClass(file: OutputFile): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'file' @ [80:47] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'inlineFunctionsJvmNames' @ [81:35] ==> public fun inlineFunctionsJvmNames(header: KotlinClassHeader): Set<String> defined in org.jetbrains.kotlin.inline[DeserializedSimpleFunctionDescriptor]

'binaryClass' @ [81:59] ==> val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'classHeader' @ [81:71] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'ClassVisitorWithName' @ [84:41] ==> public constructor ClassVisitorWithName() defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[ClassConstructorDescriptorImpl]

'name' @ [86:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [86:32] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'inlineFunctions' @ [86:40] ==> val inlineFunctions: Set<String> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'MethodNodeWithAnonymousObjectCheck' @ [87:40] ==> public constructor MethodNodeWithAnonymousObjectCheck(inlineInfo: InlineTestUtil.InlineInfo, access: Int, name: String, desc: String, signature: String?, exceptions: Array<String>?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[ClassConstructorDescriptorImpl]

'inlineInfo' @ [87:75] ==> value-parameter inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[ValueParameterDescriptorImpl]

'access' @ [87:87] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [87:95] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [87:101] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [87:107] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [87:118] ==> value-parameter exceptions: Array<String>? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'doLambdaInliningCheck' @ [89:33] ==> var doLambdaInliningCheck: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'ClassReader' @ [97:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [97:25] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'asByteArray' @ [97:30] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [97:45] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'classVisitor' @ [97:52] ==> val classVisitor: <no name provided> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'!' @ [99:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doLambdaInliningCheck' @ [99:18] ==> var doLambdaInliningCheck: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'doLambdaInliningCheck' @ [102:16] ==> var doLambdaInliningCheck: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.doLambdaInliningCheck[LocalVariableDescriptor]

'ArrayList' @ [107:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> NotInlinedCall

'files' @ [109:9] ==> value-parameter files: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked[ValueParameterDescriptorImpl]

'forEach' @ [109:15] ==> @HidesMembers public inline fun <T> Iterable<OutputFile>.forEach(action: (OutputFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'ClassReader' @ [110:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [110:25] ==> value-parameter file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [110:30] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [110:45] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitorWithName' @ [110:61] ==> public constructor ClassVisitorWithName() defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[ClassConstructorDescriptorImpl]

'desc' @ [114:25] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'METADATA_DESC' @ [114:52] ==> public const final val METADATA_DESC: (String..String?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'AnnotationVisitor' @ [115:41] ==> public constructor AnnotationVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [115:67] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [117:37] ==> value-parameter name: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'KIND_FIELD_NAME' @ [117:64] ==> public const final val KIND_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'value' @ [117:83] ==> value-parameter value: Any defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'id' @ [117:131] ==> public final val id: Int defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[DeserializedPropertyDescriptor]

'skipMethodsOfThisClass' @ [118:37] ==> private final var skipMethodsOfThisClass: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'skipMethodsOfThisClass' @ [128:25] ==> private final var skipMethodsOfThisClass: Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'MethodNode' @ [132:37] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'ASM5' @ [132:56] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [132:62] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [132:70] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [132:76] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [132:82] ==> value-parameter signature: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [132:93] ==> value-parameter exceptions: Array<String> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MethodInfo' @ [134:46] ==> public constructor MethodInfo(owner: String, name: String, desc: String) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[ClassConstructorDescriptorImpl]

'owner' @ [134:57] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [134:64] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [134:70] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'inlinedMethods' @ [135:33] ==> value-parameter inlinedMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked[ValueParameterDescriptorImpl]

'contains' @ [135:48] ==> public abstract fun contains(element: InlineTestUtil.MethodInfo): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'methodCall' @ [135:57] ==> val methodCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'MethodInfo' @ [136:48] ==> public constructor MethodInfo(owner: String, name: String, desc: String) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[ClassConstructorDescriptorImpl]

'className' @ [136:59] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'this' @ [136:70] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'name' @ [136:75] ==> public final var name: (String..String?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>[JavaPropertyDescriptor]

'this' @ [136:81] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'desc' @ [136:86] ==> public final var desc: (String..String?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>[JavaPropertyDescriptor]

'methodCall' @ [139:37] ==> val methodCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'owner' @ [139:48] ==> public final val owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[PropertyDescriptorImpl]

'endsWith' @ [139:54] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DEFAULT_IMPLS_SUFFIX' @ [139:70] ==> public const final val DEFAULT_IMPLS_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'fromCall' @ [139:95] ==> val fromCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'owner' @ [139:104] ==> public final val owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[PropertyDescriptorImpl]

'methodCall' @ [139:113] ==> val methodCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'owner' @ [139:124] ==> public final val owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[PropertyDescriptorImpl]

'notInlined' @ [142:33] ==> val notInlined: ArrayList<InlineTestUtil.NotInlinedCall> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked[LocalVariableDescriptor]

'add' @ [142:44] ==> public open fun add(element: InlineTestUtil.NotInlinedCall): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'NotInlinedCall' @ [142:48] ==> public constructor NotInlinedCall(fromCall: InlineTestUtil.MethodInfo, inlineMethod: InlineTestUtil.MethodInfo) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.NotInlinedCall[ClassConstructorDescriptorImpl]

'fromCall' @ [142:63] ==> val fromCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'methodCall' @ [142:73] ==> val methodCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'notInlined' @ [150:16] ==> val notInlined: ArrayList<InlineTestUtil.NotInlinedCall> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkInlineMethodNotInvoked[LocalVariableDescriptor]

'sourceFiles' @ [155:17] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[ValueParameterDescriptorImpl]

'flatMap' @ [155:29] ==> public inline fun <T, R> Iterable<KtFile>.flatMap(transform: (KtFile) -> Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (kotlin.String..kotlin.String?)

'findLinesWithPrefixesRemoved' @ [156:43] ==> @NotNull public open fun findLinesWithPrefixesRemoved(fileText: (String..String?), vararg prefixes: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'it' @ [156:72] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [156:75] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'toSet' @ [157:19] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'inlineInfo' @ [159:30] ==> value-parameter inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[ValueParameterDescriptorImpl]

'inlineMethods' @ [159:41] ==> public final val inlineMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.InlineInfo[PropertyDescriptorImpl]

'ArrayList' @ [160:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> NotInlinedParameter

'outputFiles' @ [161:22] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[ValueParameterDescriptorImpl]

'!' @ [162:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isClassOrPackagePartKind' @ [162:18] ==> private final fun isClassOrPackagePartKind(klass: KotlinJvmBinaryClass): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'loadBinaryClass' @ [162:43] ==> private final fun loadBinaryClass(file: OutputFile): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'file' @ [162:59] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'ClassReader' @ [164:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'file' @ [164:25] ==> val file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'asByteArray' @ [164:30] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [164:45] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitorWithName' @ [164:61] ==> public constructor ClassVisitorWithName() defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[ClassConstructorDescriptorImpl]

'MethodInfo' @ [166:39] ==> public constructor MethodInfo(owner: String, name: String, desc: String) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[ClassConstructorDescriptorImpl]

'className' @ [166:50] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>[PropertyDescriptorImpl]

'name' @ [166:61] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [166:67] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'declaration' @ [169:25] ==> val declaration: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[LocalVariableDescriptor]

'inlinedMethods' @ [169:40] ==> val inlinedMethods: Set<InlineTestUtil.MethodInfo> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'skipMethods' @ [173:25] ==> val skipMethods: Set<(String..String?)> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'contains' @ [173:37] ==> public abstract fun contains(element: (String..String?)): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'name' @ [173:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MethodNodeWithAnonymousObjectCheck' @ [177:36] ==> public constructor MethodNodeWithAnonymousObjectCheck(inlineInfo: InlineTestUtil.InlineInfo, access: Int, name: String, desc: String, signature: String?, exceptions: Array<String>?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[ClassConstructorDescriptorImpl]

'inlineInfo' @ [177:71] ==> value-parameter inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[ValueParameterDescriptorImpl]

'access' @ [177:83] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [177:91] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [177:97] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [177:103] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [177:114] ==> value-parameter exceptions: Array<String>? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MethodInfo' @ [179:44] ==> public constructor MethodInfo(owner: String, name: String, desc: String) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodInfo[ClassConstructorDescriptorImpl]

'className' @ [179:55] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>[PropertyDescriptorImpl]

'this' @ [179:66] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'name' @ [179:71] ==> public final var name: (String..String?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>[JavaPropertyDescriptor]

'this' @ [179:77] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'desc' @ [179:82] ==> public final var desc: (String..String?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>[JavaPropertyDescriptor]

'notInlinedParameters' @ [180:29] ==> val notInlinedParameters: ArrayList<InlineTestUtil.NotInlinedParameter> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'add' @ [180:50] ==> public open fun add(element: InlineTestUtil.NotInlinedParameter): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'NotInlinedParameter' @ [180:54] ==> public constructor NotInlinedParameter(parameterClassName: String, fromCall: InlineTestUtil.MethodInfo) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.NotInlinedParameter[ClassConstructorDescriptorImpl]

'owner' @ [180:74] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>.onAnonymousConstructorCallOrSingletonAccess[ValueParameterDescriptorImpl]

'fromCall' @ [180:81] ==> val fromCall: InlineTestUtil.MethodInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined.<no name provided>.visitMethod.<no name provided>.onAnonymousConstructorCallOrSingletonAccess[LocalVariableDescriptor]

'notInlinedParameters' @ [187:16] ==> val notInlinedParameters: ArrayList<InlineTestUtil.NotInlinedParameter> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.checkParametersInlined[LocalVariableDescriptor]

'classInternalName' @ [191:13] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isTopLevelOrInnerOrPackageClass[ValueParameterDescriptorImpl]

'startsWith' @ [191:31] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isClassOrPackagePartKind' @ [194:16] ==> private final fun isClassOrPackagePartKind(klass: KotlinJvmBinaryClass): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'inlineInfo' @ [194:41] ==> value-parameter inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isTopLevelOrInnerOrPackageClass[ValueParameterDescriptorImpl]

'binaryClasses' @ [194:52] ==> public final val binaryClasses: Map<String, KotlinJvmBinaryClass> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.InlineInfo[PropertyDescriptorImpl]

'classInternalName' @ [194:66] ==> value-parameter classInternalName: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isTopLevelOrInnerOrPackageClass[ValueParameterDescriptorImpl]

'klass' @ [198:16] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isClassOrPackagePartKind[ValueParameterDescriptorImpl]

'classHeader' @ [198:22] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'kind' @ [198:34] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'CLASS' @ [198:65] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'!' @ [198:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [198:75] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isClassOrPackagePartKind[ValueParameterDescriptorImpl]

'classId' @ [198:81] ==> public abstract val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'isLocal' @ [198:89] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'klass' @ [199:19] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isClassOrPackagePartKind[ValueParameterDescriptorImpl]

'classHeader' @ [199:25] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'kind' @ [199:37] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'FILE_FACADE' @ [199:68] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'klass' @ [200:19] ==> value-parameter klass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.codegen.InlineTestUtil.isClassOrPackagePartKind[ValueParameterDescriptorImpl]

'classHeader' @ [200:25] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'kind' @ [200:37] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'MULTIFILE_CLASS_PART' @ [200:68] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'!!' @ [204:21] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: <no name provided>?): <no name provided>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> <no name provided>

'create' @ [204:42] ==> @Nullable public open fun <T : (FileBasedKotlinClass..FileBasedKotlinClass?)> create(@NotNull p0: ByteArray, @NotNull p1: ((ClassId..ClassId?), (Int..Int?), (KotlinClassHeader..KotlinClassHeader?), (FileBasedKotlinClass.InnerClassesInfo..FileBasedKotlinClass.InnerClassesInfo?)) -> (<no name provided>..<no name provided>?)): <no name provided>? defined in org.jetbrains.kotlin.load.kotlin.FileBasedKotlinClass[JavaMethodDescriptor]
Inferred types:
    <T : (FileBasedKotlinClass..FileBasedKotlinClass?)> -> <no name provided>

'file' @ [204:49] ==> value-parameter file: OutputFile defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass[ValueParameterDescriptorImpl]

'asByteArray' @ [204:54] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'FileBasedKotlinClass' @ [206:22] ==> protected/*protected and package*/ constructor FileBasedKotlinClass(@NotNull p0: ClassId, p1: Int, @NotNull p2: KotlinClassHeader, @NotNull p3: FileBasedKotlinClass.InnerClassesInfo) defined in org.jetbrains.kotlin.load.kotlin.FileBasedKotlinClass[JavaClassConstructorDescriptor]

'className' @ [206:43] ==> value-parameter className: (ClassId..ClassId?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass.<anonymous>[ValueParameterDescriptorImpl]

'classVersion' @ [206:54] ==> value-parameter classVersion: (Int..Int?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass.<anonymous>[ValueParameterDescriptorImpl]

'classHeader' @ [206:68] ==> value-parameter classHeader: (KotlinClassHeader..KotlinClassHeader?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass.<anonymous>[ValueParameterDescriptorImpl]

'innerClasses' @ [206:81] ==> value-parameter innerClasses: (FileBasedKotlinClass.InnerClassesInfo..FileBasedKotlinClass.InnerClassesInfo?) defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass.<anonymous>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [208:35] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [209:67] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [210:54] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [211:67] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [212:57] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'klass' @ [215:16] ==> val klass: <no name provided> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.loadBinaryClass[LocalVariableDescriptor]

'ClassVisitor' @ [226:47] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [226:68] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'className' @ [230:13] ==> public final lateinit var className: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[PropertyDescriptorImpl]

'name' @ [230:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'super' @ [231:13] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName[LazyClassReceiverParameterDescriptor]

'visit' @ [231:19] ==> public open fun visit(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'version' @ [231:25] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'access' @ [231:34] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'name' @ [231:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'signature' @ [231:48] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'superName' @ [231:59] ==> value-parameter superName: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'interfaces' @ [231:70] ==> value-parameter interfaces: Array<String>? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.ClassVisitorWithName.visit[ValueParameterDescriptorImpl]

'MethodNode' @ [235:182] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'ASM5' @ [235:201] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [235:207] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.<init>[ValueParameterDescriptorImpl]

'name' @ [235:215] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.<init>[ValueParameterDescriptorImpl]

'desc' @ [235:221] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.<init>[ValueParameterDescriptorImpl]

'signature' @ [235:227] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.<init>[ValueParameterDescriptorImpl]

'exceptions' @ [235:238] ==> value-parameter exceptions: Array<String>? defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.<init>[ValueParameterDescriptorImpl]

'in' @ [237:17] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'owner' @ [237:24] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.isInlineParameterLikeOwner[ValueParameterDescriptorImpl]

'!' @ [237:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTopLevelOrInnerOrPackageClass' @ [237:34] ==> private final fun isTopLevelOrInnerOrPackageClass(classInternalName: String, inlineInfo: InlineTestUtil.InlineInfo): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil[SimpleFunctionDescriptorImpl]

'owner' @ [237:66] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.isInlineParameterLikeOwner[ValueParameterDescriptorImpl]

'inlineInfo' @ [237:73] ==> public final val inlineInfo: InlineTestUtil.InlineInfo defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[PropertyDescriptorImpl]

'==' @ [240:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [240:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitMethodInsn[ValueParameterDescriptorImpl]

'isInlineParameterLikeOwner' @ [240:37] ==> private final fun isInlineParameterLikeOwner(owner: String): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[SimpleFunctionDescriptorImpl]

'owner' @ [240:64] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitMethodInsn[ValueParameterDescriptorImpl]

'onAnonymousConstructorCallOrSingletonAccess' @ [241:17] ==> public abstract fun onAnonymousConstructorCallOrSingletonAccess(owner: String): Unit defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[SimpleFunctionDescriptorImpl]

'owner' @ [241:61] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitMethodInsn[ValueParameterDescriptorImpl]

'opcode' @ [248:17] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'GETSTATIC' @ [248:35] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isInlineParameterLikeOwner' @ [248:48] ==> private final fun isInlineParameterLikeOwner(owner: String): Boolean defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[SimpleFunctionDescriptorImpl]

'owner' @ [248:75] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'onAnonymousConstructorCallOrSingletonAccess' @ [249:17] ==> public abstract fun onAnonymousConstructorCallOrSingletonAccess(owner: String): Unit defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[SimpleFunctionDescriptorImpl]

'owner' @ [249:61] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'super' @ [251:13] ==> <this> defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck[LazyClassReceiverParameterDescriptor]

'visitFieldInsn' @ [251:19] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'opcode' @ [251:34] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'owner' @ [251:42] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'name' @ [251:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

'desc' @ [251:55] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.InlineTestUtil.MethodNodeWithAnonymousObjectCheck.visitFieldInsn[ValueParameterDescriptorImpl]

