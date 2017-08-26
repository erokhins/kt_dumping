'listOf' @ [33:32] ==> public fun <T> listOf(vararg elements: ClassLoadingAdapter): List<ClassLoadingAdapter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoadingAdapter

'AndroidOClassLoadingAdapter' @ [34:17] ==> public constructor AndroidOClassLoadingAdapter() defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.AndroidOClassLoadingAdapter[ClassConstructorDescriptorImpl]

'OrdinaryClassLoadingAdapter' @ [35:17] ==> public constructor OrdinaryClassLoadingAdapter() defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.OrdinaryClassLoadingAdapter[ClassConstructorDescriptorImpl]

'classes' @ [38:40] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'size' @ [38:48] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'classes' @ [39:28] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'isNotEmpty' @ [39:36] ==> @InlineOnly public inline fun <T> Collection<ClassToLoad>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassToLoad

'doesContainLoops' @ [39:52] ==> private final fun doesContainLoops(clazz: ByteArray): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion[SimpleFunctionDescriptorImpl]

'classes' @ [39:69] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'first' @ [39:77] ==> public fun <T> Iterable<ClassToLoad>.first(): ClassToLoad defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassToLoad

'bytes' @ [39:85] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassToLoad[PropertyDescriptorImpl]

'ADAPTERS' @ [41:29] ==> private final val ADAPTERS: List<ClassLoadingAdapter> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion[PropertyDescriptorImpl]

'adapter' @ [42:21] ==> val adapter: ClassLoadingAdapter defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[LocalVariableDescriptor]

'isApplicable' @ [42:29] ==> public abstract fun isApplicable(context: EvaluationContextImpl, hasAdditionalClasses: Boolean, hasLoops: Boolean): Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter[SimpleFunctionDescriptorImpl]

'context' @ [43:25] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'hasAdditionalClasses' @ [44:48] ==> val hasAdditionalClasses: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[LocalVariableDescriptor]

'hasLoops' @ [45:36] ==> val hasLoops: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[LocalVariableDescriptor]

'adapter' @ [47:28] ==> val adapter: ClassLoadingAdapter defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[LocalVariableDescriptor]

'loadClasses' @ [47:36] ==> public abstract fun loadClasses(context: EvaluationContextImpl, classes: Collection<ClassToLoad>): ClassLoaderHandler defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter[SimpleFunctionDescriptorImpl]

'context' @ [47:48] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'classes' @ [47:57] ==> value-parameter classes: Collection<ClassToLoad> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.loadClasses[ValueParameterDescriptorImpl]

'ClassNode' @ [55:29] ==> public constructor ClassNode() defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaClassConstructorDescriptor]

'apply' @ [55:41] ==> @InlineOnly public inline fun <T> ClassNode.apply(block: ClassNode.() -> Unit): ClassNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'ClassReader' @ [55:49] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'clazz' @ [55:61] ==> value-parameter clazz: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[ValueParameterDescriptorImpl]

'accept' @ [55:68] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'this' @ [55:75] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops.<anonymous>[ReceiverParameterDescriptorImpl]

'EXPAND_FRAMES' @ [55:93] ==> public const final val EXPAND_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'classNode' @ [56:31] ==> val classNode: ClassNode defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'methods' @ [56:41] ==> public final var methods: (MutableList<(MethodNode..MethodNode?)>..List<(MethodNode..MethodNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'single' @ [56:49] ==> public fun <T> List<(MethodNode..MethodNode?)>.single(): (MethodNode..MethodNode?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.MethodNode..org.jetbrains.org.objectweb.asm.tree.MethodNode?)

'hashSetOf' @ [58:33] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Label> /* = HashSet<Label> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'methodToRun' @ [59:31] ==> val methodToRun: (MethodNode..MethodNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'instructions' @ [59:43] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [59:56] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'currentInsn' @ [60:20] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'if (currentInsn is LabelNode) {
                    labelsVisited += currentInsn.label
                }
                else if (currentInsn is JumpInsnNode) {
                    if (currentInsn.label.label in labelsVisited) {
                        return true
                    }
                }' @ [61:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'currentInsn' @ [61:21] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'labelsVisited' @ [62:21] ==> val labelsVisited: HashSet<Label> /* = HashSet<Label> */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'currentInsn' @ [62:38] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'label' @ [62:50] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'currentInsn' @ [64:26] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'currentInsn' @ [65:25] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'label' @ [65:37] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'label' @ [65:43] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'labelsVisited' @ [65:52] ==> val labelsVisited: HashSet<Label> /* = HashSet<Label> */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'currentInsn' @ [70:17] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'currentInsn' @ [70:31] ==> var currentInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.Companion.doesContainLoops[LocalVariableDescriptor]

'next' @ [70:43] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'process' @ [82:26] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'findClass' @ [82:34] ==> public open fun findClass(p0: (EvaluationContext..EvaluationContext?), p1: (String..String?), p2: (ClassLoaderReference..ClassLoaderReference?)): (ReferenceType..ReferenceType?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'context' @ [82:44] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'context' @ [82:63] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'classLoader' @ [82:71] ==> public final var EvaluationContextImpl.classLoader: ClassLoaderReference?[MyPropertyDescriptor]

'process' @ [83:25] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'newInstance' @ [83:33] ==> public open fun newInstance(p0: (ArrayType..ArrayType?), p1: Int): (ArrayReference..ArrayReference?) defined in com.intellij.debugger.engine.DebugProcessImpl[JavaMethodDescriptor]

'arrayClass' @ [83:45] ==> val arrayClass: ArrayType defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'bytes' @ [83:57] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'size' @ [83:63] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'keep' @ [84:25] ==> public open fun keep(p0: (Value..Value?), p1: (EvaluationContext..EvaluationContext?)): Unit defined in com.intellij.debugger.impl.DebuggerUtilsEx[JavaMethodDescriptor]

'reference' @ [84:30] ==> val reference: (ArrayReference..ArrayReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'context' @ [84:41] ==> value-parameter context: EvaluationContextImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'ArrayList' @ [86:23] ==> public final fun <E> <init>(p0: Int): ArrayList<Value> /* = ArrayList<Value> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Value

'bytes' @ [86:40] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'size' @ [86:46] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'bytes' @ [87:22] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'mirrors' @ [88:13] ==> val mirrors: ArrayList<Value> /* = ArrayList<Value> */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'process' @ [88:24] ==> value-parameter process: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[ValueParameterDescriptorImpl]

'virtualMachineProxy' @ [88:32] ==> public final val DebugProcessImpl.virtualMachineProxy: VirtualMachineProxyImpl[MyPropertyDescriptor]

'mirrorOf' @ [88:52] ==> public open fun mirrorOf(p0: Byte): (ByteValue..ByteValue?) defined in com.intellij.debugger.jdi.VirtualMachineProxyImpl[JavaMethodDescriptor]

'byte' @ [88:61] ==> val byte: Byte defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'reference' @ [90:9] ==> val reference: (ArrayReference..ArrayReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'values' @ [90:19] ==> public final var ArrayReference.values: (MutableList<(Value..Value?)>..List<(Value..Value?)>?)[MyPropertyDescriptor]

'mirrors' @ [90:28] ==> val mirrors: ArrayList<Value> /* = ArrayList<Value> */ defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

'reference' @ [92:16] ==> val reference: (ArrayReference..ArrayReference?) defined in org.jetbrains.kotlin.idea.debugger.evaluate.classLoading.ClassLoadingAdapter.mirrorOfByteArray[LocalVariableDescriptor]

