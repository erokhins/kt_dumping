'JvmStatic' @ [31:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getFunctionTypeArity' @ [32:33] ==> private final fun getFunctionTypeArity(jetType: KotlinType): Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [32:54] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'functionTypeArity' @ [33:13] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'v' @ [34:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'iconst' @ [34:15] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'functionTypeArity' @ [34:22] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'v' @ [35:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'typeIntrinsic' @ [35:15] ==> private final fun InstructionAdapter.typeIntrinsic(methodName: String, methodDescriptor: String): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'IS_FUNCTON_OF_ARITY_METHOD_NAME' @ [35:29] ==> private final val IS_FUNCTON_OF_ARITY_METHOD_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'IS_FUNCTON_OF_ARITY_DESCRIPTOR' @ [35:62] ==> private final val IS_FUNCTON_OF_ARITY_DESCRIPTOR: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'getIsMutableCollectionMethodName' @ [39:45] ==> private final fun getIsMutableCollectionMethodName(jetType: KotlinType): String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [39:78] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'isMutableCollectionMethodName' @ [40:13] ==> val isMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'v' @ [41:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'typeIntrinsic' @ [41:15] ==> private final fun InstructionAdapter.typeIntrinsic(methodName: String, methodDescriptor: String): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'isMutableCollectionMethodName' @ [41:29] ==> val isMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'IS_MUTABLE_COLLECTION_METHOD_DESCRIPTOR' @ [41:60] ==> private final val IS_MUTABLE_COLLECTION_METHOD_DESCRIPTOR: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'v' @ [45:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'instanceOf' @ [45:11] ==> public open fun instanceOf(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'boxedAsmType' @ [45:22] ==> value-parameter boxedAsmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'if (value >= -1 && value <= 5) {
                InsnNode(Opcodes.ICONST_0 + value)
            }
            else if (value >= java.lang.Byte.MIN_VALUE && value <= java.lang.Byte.MAX_VALUE) {
                IntInsnNode(Opcodes.BIPUSH, value)
            }
            else if (value >= java.lang.Short.MIN_VALUE && value <= java.lang.Short.MAX_VALUE) {
                IntInsnNode(Opcodes.SIPUSH, value)
            }
            else {
                LdcInsnNode(Integer(value))
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractInsnNode, elseBranch: AbstractInsnNode): AbstractInsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractInsnNode

'value' @ [49:17] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'-' @ [49:26] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [49:32] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'InsnNode' @ [50:17] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'+' @ [50:26] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ICONST_0' @ [50:34] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [50:45] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'if (value >= java.lang.Byte.MIN_VALUE && value <= java.lang.Byte.MAX_VALUE) {
                IntInsnNode(Opcodes.BIPUSH, value)
            }
            else if (value >= java.lang.Short.MIN_VALUE && value <= java.lang.Short.MAX_VALUE) {
                IntInsnNode(Opcodes.SIPUSH, value)
            }
            else {
                LdcInsnNode(Integer(value))
            }' @ [52:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractInsnNode, elseBranch: AbstractInsnNode): AbstractInsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractInsnNode

'value' @ [52:22] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'MIN_VALUE' @ [52:46] ==> public const final val MIN_VALUE: Byte defined in java.lang.Byte[JavaPropertyDescriptor]

'value' @ [52:59] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'MAX_VALUE' @ [52:83] ==> public const final val MAX_VALUE: Byte defined in java.lang.Byte[JavaPropertyDescriptor]

'IntInsnNode' @ [53:17] ==> public constructor IntInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaClassConstructorDescriptor]

'BIPUSH' @ [53:37] ==> public const final val BIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [53:45] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'if (value >= java.lang.Short.MIN_VALUE && value <= java.lang.Short.MAX_VALUE) {
                IntInsnNode(Opcodes.SIPUSH, value)
            }
            else {
                LdcInsnNode(Integer(value))
            }' @ [55:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractInsnNode, elseBranch: AbstractInsnNode): AbstractInsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractInsnNode

'value' @ [55:22] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'MIN_VALUE' @ [55:47] ==> public const final val MIN_VALUE: Short defined in java.lang.Short[JavaPropertyDescriptor]

'value' @ [55:60] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'MAX_VALUE' @ [55:85] ==> public const final val MAX_VALUE: Short defined in java.lang.Short[JavaPropertyDescriptor]

'IntInsnNode' @ [56:17] ==> public constructor IntInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaClassConstructorDescriptor]

'SIPUSH' @ [56:37] ==> public const final val SIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [56:45] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'LdcInsnNode' @ [59:17] ==> public constructor LdcInsnNode(p0: (Any..Any?)) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaClassConstructorDescriptor]

'Integer' @ [59:29] ==> public constructor Integer(p0: Int) defined in java.lang.Integer[JavaClassConstructorDescriptor]

'value' @ [59:37] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.iconstNode[ValueParameterDescriptorImpl]

'JvmStatic' @ [62:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getFunctionTypeArity' @ [63:33] ==> private final fun getFunctionTypeArity(jetType: KotlinType): Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [63:54] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'functionTypeArity' @ [64:13] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'instructions' @ [65:13] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'insertBefore' @ [65:26] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'instanceofInsn' @ [65:39] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'iconstNode' @ [65:55] ==> private final fun iconstNode(value: Int): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'functionTypeArity' @ [65:66] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'instructions' @ [66:13] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'insertBefore' @ [66:26] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'instanceofInsn' @ [66:39] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'typeIntrinsicNode' @ [67:39] ==> private final fun typeIntrinsicNode(methodName: String, methodDescriptor: String): MethodInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'IS_FUNCTON_OF_ARITY_METHOD_NAME' @ [67:57] ==> private final val IS_FUNCTON_OF_ARITY_METHOD_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'IS_FUNCTON_OF_ARITY_DESCRIPTOR' @ [67:90] ==> private final val IS_FUNCTON_OF_ARITY_DESCRIPTOR: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'instructions' @ [68:13] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'remove' @ [68:26] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'instanceofInsn' @ [68:33] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'getIsMutableCollectionMethodName' @ [72:45] ==> private final fun getIsMutableCollectionMethodName(jetType: KotlinType): String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [72:78] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'isMutableCollectionMethodName' @ [73:13] ==> val isMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'instructions' @ [74:13] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'insertBefore' @ [74:26] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'instanceofInsn' @ [74:39] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'typeIntrinsicNode' @ [75:39] ==> private final fun typeIntrinsicNode(methodName: String, methodDescriptor: String): MethodInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'isMutableCollectionMethodName' @ [75:57] ==> val isMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[LocalVariableDescriptor]

'IS_MUTABLE_COLLECTION_METHOD_DESCRIPTOR' @ [75:88] ==> private final val IS_MUTABLE_COLLECTION_METHOD_DESCRIPTOR: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'instructions' @ [76:13] ==> value-parameter instructions: InsnList defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'remove' @ [76:26] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'instanceofInsn' @ [76:33] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'instanceofInsn' @ [80:9] ==> value-parameter instanceofInsn: TypeInsnNode defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'desc' @ [80:24] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'asmType' @ [80:31] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.instanceOf[ValueParameterDescriptorImpl]

'internalName' @ [80:39] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'JvmStatic' @ [83:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'safe' @ [90:13] ==> value-parameter safe: Boolean defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'v' @ [91:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'checkcast' @ [91:15] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [91:25] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'getFunctionTypeArity' @ [95:33] ==> private final fun getFunctionTypeArity(jetType: KotlinType): Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'kotlinType' @ [95:54] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'functionTypeArity' @ [96:13] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[LocalVariableDescriptor]

'v' @ [97:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'iconst' @ [97:15] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'functionTypeArity' @ [97:22] ==> val functionTypeArity: Int defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[LocalVariableDescriptor]

'v' @ [98:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'typeIntrinsic' @ [98:15] ==> private final fun InstructionAdapter.typeIntrinsic(methodName: String, methodDescriptor: String): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'BEFORE_CHECKCAST_TO_FUNCTION_OF_ARITY' @ [98:29] ==> private final val BEFORE_CHECKCAST_TO_FUNCTION_OF_ARITY: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'BEFORE_CHECKCAST_TO_FUNCTION_OF_ARITY_DESCRIPTOR' @ [98:68] ==> private final val BEFORE_CHECKCAST_TO_FUNCTION_OF_ARITY_DESCRIPTOR: (String..String?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'v' @ [99:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'checkcast' @ [99:15] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [99:25] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'getAsMutableCollectionMethodName' @ [103:45] ==> private final fun getAsMutableCollectionMethodName(jetType: KotlinType): String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'kotlinType' @ [103:78] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'asMutableCollectionMethodName' @ [104:13] ==> val asMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[LocalVariableDescriptor]

'v' @ [105:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'typeIntrinsic' @ [105:15] ==> private final fun InstructionAdapter.typeIntrinsic(methodName: String, methodDescriptor: String): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'asMutableCollectionMethodName' @ [105:29] ==> val asMutableCollectionMethodName: String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[LocalVariableDescriptor]

'getAsMutableCollectionDescriptor' @ [105:60] ==> private final fun getAsMutableCollectionDescriptor(asmType: Type): String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'asmType' @ [105:93] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'v' @ [109:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'checkcast' @ [109:11] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'asmType' @ [109:21] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.checkcast[ValueParameterDescriptorImpl]

'getMethodDescriptor' @ [117:18] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [117:43] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'getObjectType' @ [117:62] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'INT_TYPE' @ [117:102] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setOf' @ [120:52] ==> public fun <T> setOf(vararg elements: (FqName..FqName?)): Set<(FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'FQ_NAMES' @ [121:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableIterator' @ [121:22] ==> public final val mutableIterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [122:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableIterable' @ [122:22] ==> public final val mutableIterable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [123:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableCollection' @ [123:22] ==> public final val mutableCollection: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [124:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableList' @ [124:22] ==> public final val mutableList: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [125:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableListIterator' @ [125:22] ==> public final val mutableListIterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [126:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableMap' @ [126:22] ==> public final val mutableMap: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [127:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableSet' @ [127:22] ==> public final val mutableSet: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [128:13] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableMapEntry' @ [128:22] ==> public final val mutableMapEntry: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'getClassFqName' @ [132:22] ==> private final fun getClassFqName(jetType: KotlinType): FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [132:37] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[ValueParameterDescriptorImpl]

'fqName' @ [133:13] ==> val fqName: FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[LocalVariableDescriptor]

'fqName' @ [133:31] ==> val fqName: FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[LocalVariableDescriptor]

'MUTABLE_COLLECTION_TYPE_FQ_NAMES' @ [133:42] ==> private final val MUTABLE_COLLECTION_TYPE_FQ_NAMES: Set<(FqName..FqName?)> defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'if (fqName == FQ_NAMES.mutableMapEntry) "MutableMapEntry" else fqName.shortName().asString()' @ [134:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fqName' @ [134:28] ==> val fqName: FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[LocalVariableDescriptor]

'FQ_NAMES' @ [134:38] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableMapEntry' @ [134:47] ==> public final val mutableMapEntry: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'fqName' @ [134:87] ==> val fqName: FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[LocalVariableDescriptor]

'shortName' @ [134:94] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [134:106] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'prefix' @ [135:16] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[ValueParameterDescriptorImpl]

'baseName' @ [135:25] ==> val baseName: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getMutableCollectionMethodName[LocalVariableDescriptor]

'getMutableCollectionMethodName' @ [138:82] ==> private final fun getMutableCollectionMethodName(prefix: String, jetType: KotlinType): String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [138:119] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getIsMutableCollectionMethodName[ValueParameterDescriptorImpl]

'getMutableCollectionMethodName' @ [140:82] ==> private final fun getMutableCollectionMethodName(prefix: String, jetType: KotlinType): String? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [140:119] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getAsMutableCollectionMethodName[ValueParameterDescriptorImpl]

'getMethodDescriptor' @ [143:18] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [143:43] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'getObjectType' @ [143:62] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'?:' @ [146:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getClassDescriptor' @ [146:41] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'jetType' @ [146:60] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getClassFqName[ValueParameterDescriptorImpl]

'getFqName' @ [147:32] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [147:42] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getClassFqName[LocalVariableDescriptor]

'toSafe' @ [147:59] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'Regex' @ [150:51] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'getClassFqName' @ [156:27] ==> private final fun getClassFqName(jetType: KotlinType): FqName? defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'jetType' @ [156:42] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getFunctionTypeArity[ValueParameterDescriptorImpl]

'-' @ [156:61] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'KOTLIN_FUNCTION_INTERFACE_REGEX' @ [157:21] ==> private final val KOTLIN_FUNCTION_INTERFACE_REGEX: Regex defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'find' @ [157:53] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'classFqName' @ [157:58] ==> val classFqName: FqName defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getFunctionTypeArity[LocalVariableDescriptor]

'asString' @ [157:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'-' @ [157:92] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [158:24] ==> public open fun valueOf(p0: (String..String?)): (Int..Int?) defined in java.lang.Integer[JavaMethodDescriptor]

'match' @ [158:32] ==> val match: MatchResult defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getFunctionTypeArity[LocalVariableDescriptor]

'groups' @ [158:38] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [158:50] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'MethodInsnNode' @ [162:13] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKESTATIC' @ [162:36] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INTRINSICS_CLASS' @ [162:50] ==> private final val INTRINSICS_CLASS: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'methodName' @ [162:68] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.typeIntrinsicNode[ValueParameterDescriptorImpl]

'methodDescriptor' @ [162:80] ==> value-parameter methodDescriptor: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.typeIntrinsicNode[ValueParameterDescriptorImpl]

'invokestatic' @ [165:9] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INTRINSICS_CLASS' @ [165:22] ==> private final val INTRINSICS_CLASS: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'methodName' @ [165:40] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.typeIntrinsic[ValueParameterDescriptorImpl]

'methodDescriptor' @ [165:52] ==> value-parameter methodDescriptor: String defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.typeIntrinsic[ValueParameterDescriptorImpl]

'getObjectType' @ [169:36] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'getMethodDescriptor' @ [172:18] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'asmType' @ [172:38] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics.getAsMutableCollectionDescriptor[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [172:47] ==> private final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'getMethodDescriptor' @ [177:18] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'OBJECT_TYPE' @ [177:38] ==> private final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'OBJECT_TYPE' @ [177:51] ==> private final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[PropertyDescriptorImpl]

'INT_TYPE' @ [177:69] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

