'buildLazyValueForMap' @ [38:41] ==> public fun JavaAnnotationOwner.buildLazyValueForMap(): Lazy<Map<FqName?, JavaAnnotation>> defined in org.jetbrains.kotlin.load.java.structure[DeserializedSimpleFunctionDescriptor]

'newSmartList' @ [40:74] ==> @NotNull @Contract public open fun <T : (Any..Any?)> newSmartList(): (MutableList<(JavaAnnotation..JavaAnnotation?)>..List<(JavaAnnotation..JavaAnnotation?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaAnnotation

'==' @ [58:33] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [58:45] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'access' @ [59:29] ==> value-parameter access: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'isSet' @ [59:36] ==> internal fun Int.isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles[SimpleFunctionDescriptorImpl]

'ACC_VARARGS' @ [59:50] ==> public const final val ACC_VARARGS: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isConstructor' @ [61:43] ==> val isConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'containingClass' @ [61:60] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'outerClass' @ [61:76] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'!' @ [61:98] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [61:99] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'isStatic' @ [61:115] ==> public abstract val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'containingClass' @ [62:37] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'isEnum' @ [62:53] ==> public abstract val isEnum: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'isConstructor' @ [62:63] ==> val isConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'if (signature != null) {
                        val contextForMethod = parentContext.copyForMember()
                        parseMethodSignature(signature, signatureParser, contextForMethod).also {
                            contextForMethod.addTypeParameters(it.typeParameters)
                        }
                    } else
                        parseMethodDescription(desc, parentContext, signatureParser).let {
                            when {
                                isEnumConstructor ->
                                    // skip ordinal/name parameters for enum constructors
                                    MethodInfo(it.returnType, it.typeParameters, it.valueParameterTypes.drop(2))
                                isInnerClassConstructor ->
                                    // omit synthetic inner class constructor parameter
                                    MethodInfo(it.returnType, it.typeParameters, it.valueParameterTypes.drop(1))
                                else -> it
                            }
                        }' @ [64:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BinaryJavaMethodBase.Companion.MethodInfo, elseBranch: BinaryJavaMethodBase.Companion.MethodInfo): BinaryJavaMethodBase.Companion.MethodInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MethodInfo

'signature' @ [64:25] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'parentContext' @ [65:48] ==> value-parameter parentContext: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'copyForMember' @ [65:62] ==> internal final fun copyForMember(): ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'parseMethodSignature' @ [66:25] ==> private final fun parseMethodSignature(signature: String, signatureParser: BinaryClassSignatureParser, context: ClassifierResolutionContext): BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion[SimpleFunctionDescriptorImpl]

'signature' @ [66:46] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'signatureParser' @ [66:57] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'contextForMethod' @ [66:74] ==> val contextForMethod: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'also' @ [66:92] ==> @InlineOnly @SinceKotlin public inline fun <T> BinaryJavaMethodBase.Companion.MethodInfo.also(block: (BinaryJavaMethodBase.Companion.MethodInfo) -> Unit): BinaryJavaMethodBase.Companion.MethodInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodInfo

'contextForMethod' @ [67:29] ==> val contextForMethod: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'addTypeParameters' @ [67:46] ==> internal final fun addTypeParameters(newTypeParameters: Collection<JavaTypeParameter>): Unit defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.ClassifierResolutionContext[SimpleFunctionDescriptorImpl]

'it' @ [67:64] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [67:67] ==> public final val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'parseMethodDescription' @ [70:25] ==> private final fun parseMethodDescription(desc: String, context: ClassifierResolutionContext, signatureParser: BinaryClassSignatureParser): BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion[SimpleFunctionDescriptorImpl]

'desc' @ [70:48] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'parentContext' @ [70:54] ==> value-parameter parentContext: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'signatureParser' @ [70:69] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'let' @ [70:86] ==> @InlineOnly public inline fun <T, R> BinaryJavaMethodBase.Companion.MethodInfo.let(block: (BinaryJavaMethodBase.Companion.MethodInfo) -> BinaryJavaMethodBase.Companion.MethodInfo): BinaryJavaMethodBase.Companion.MethodInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodInfo
    <R> -> MethodInfo

'when {
                                isEnumConstructor ->
                                    // skip ordinal/name parameters for enum constructors
                                    MethodInfo(it.returnType, it.typeParameters, it.valueParameterTypes.drop(2))
                                isInnerClassConstructor ->
                                    // omit synthetic inner class constructor parameter
                                    MethodInfo(it.returnType, it.typeParameters, it.valueParameterTypes.drop(1))
                                else -> it
                            }' @ [71:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BinaryJavaMethodBase.Companion.MethodInfo, entry1: BinaryJavaMethodBase.Companion.MethodInfo, entry2: BinaryJavaMethodBase.Companion.MethodInfo): BinaryJavaMethodBase.Companion.MethodInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MethodInfo

'isEnumConstructor' @ [72:33] ==> val isEnumConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'MethodInfo' @ [74:37] ==> public constructor MethodInfo(returnType: JavaType, typeParameters: List<JavaTypeParameter>, valueParameterTypes: List<JavaType>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[ClassConstructorDescriptorImpl]

'it' @ [74:48] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [74:51] ==> public final val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'it' @ [74:63] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [74:66] ==> public final val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'it' @ [74:82] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [74:85] ==> public final val valueParameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'drop' @ [74:105] ==> public fun <T> Iterable<JavaType>.drop(n: Int): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'isInnerClassConstructor' @ [75:33] ==> val isInnerClassConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'MethodInfo' @ [77:37] ==> public constructor MethodInfo(returnType: JavaType, typeParameters: List<JavaTypeParameter>, valueParameterTypes: List<JavaType>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[ClassConstructorDescriptorImpl]

'it' @ [77:48] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [77:51] ==> public final val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'it' @ [77:63] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [77:66] ==> public final val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'it' @ [77:82] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [77:85] ==> public final val valueParameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'drop' @ [77:105] ==> public fun <T> Iterable<JavaType>.drop(n: Int): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'it' @ [78:41] ==> value-parameter it: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [82:34] ==> val info: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'valueParameterTypes' @ [82:39] ==> public final val valueParameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'newArrayList' @ [83:47] ==> @NotNull @Contract public open fun <T : (Any..Any?)> newArrayList(): ArrayList<(JavaValueParameter..JavaValueParameter?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaValueParameter

'parameterTypes' @ [84:30] ==> val parameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'size' @ [84:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'..' @ [85:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'paramCount' @ [85:26] ==> val paramCount: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'parameterTypes' @ [86:28] ==> val parameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'i' @ [86:43] ==> val i: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'isVarargs' @ [87:39] ==> val isVarargs: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'i' @ [87:52] ==> val i: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'paramCount' @ [87:57] ==> val paramCount: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'parameterList' @ [89:17] ==> val parameterList: ArrayList<(JavaValueParameter..JavaValueParameter?)> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'add' @ [89:31] ==> public open fun add(element: (JavaValueParameter..JavaValueParameter?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'BinaryJavaValueParameter' @ [89:35] ==> public constructor BinaryJavaValueParameter(name: Name?, type: JavaType, isVararg: Boolean) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaValueParameter[ClassConstructorDescriptorImpl]

'type' @ [89:66] ==> val type: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'isEllipsisParam' @ [89:72] ==> val isEllipsisParam: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'if (isConstructor)
                        BinaryJavaConstructor(access, containingClass, parameterList, info.typeParameters)
                    else
                        BinaryJavaMethod(
                                access, containingClass,
                                parameterList.compact(),
                                info.typeParameters,
                                Name.identifier(name), info.returnType
                        )' @ [93:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BinaryJavaMethodBase, elseBranch: BinaryJavaMethodBase): BinaryJavaMethodBase[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BinaryJavaMethodBase

'isConstructor' @ [93:25] ==> val isConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'BinaryJavaConstructor' @ [94:25] ==> public constructor BinaryJavaConstructor(flags: Int, containingClass: JavaClass, valueParameters: List<JavaValueParameter>, typeParameters: List<JavaTypeParameter>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaConstructor[ClassConstructorDescriptorImpl]

'access' @ [94:47] ==> value-parameter access: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'containingClass' @ [94:55] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'parameterList' @ [94:72] ==> val parameterList: ArrayList<(JavaValueParameter..JavaValueParameter?)> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'info' @ [94:87] ==> val info: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'typeParameters' @ [94:92] ==> public final val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'BinaryJavaMethod' @ [96:25] ==> public constructor BinaryJavaMethod(flags: Int, containingClass: JavaClass, valueParameters: List<JavaValueParameter>, typeParameters: List<JavaTypeParameter>, name: Name, returnType: JavaType) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod[ClassConstructorDescriptorImpl]

'access' @ [97:33] ==> value-parameter access: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'containingClass' @ [97:41] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'parameterList' @ [98:33] ==> val parameterList: ArrayList<(JavaValueParameter..JavaValueParameter?)> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'compact' @ [98:47] ==> public fun <T> ArrayList<(JavaValueParameter..JavaValueParameter?)>.compact(): List<(JavaValueParameter..JavaValueParameter?)> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.load.java.structure.JavaValueParameter..org.jetbrains.kotlin.load.java.structure.JavaValueParameter?)

'info' @ [99:33] ==> val info: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'typeParameters' @ [99:38] ==> public final val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'identifier' @ [100:38] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [100:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'info' @ [100:56] ==> val info: BinaryJavaMethodBase.Companion.MethodInfo defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'returnType' @ [100:61] ==> public final val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[PropertyDescriptorImpl]

'when {
                isEnumConstructor -> 2
                isInnerClassConstructor -> 1
                else -> 0
            }' @ [103:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'isEnumConstructor' @ [104:17] ==> val isEnumConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'isInnerClassConstructor' @ [105:17] ==> val isInnerClassConstructor: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'member' @ [109:20] ==> val member: BinaryJavaMethodBase defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'AnnotationsCollectorMethodVisitor' @ [109:30] ==> public constructor AnnotationsCollectorMethodVisitor(member: BinaryJavaMethodBase, context: ClassifierResolutionContext, signatureParser: BinaryClassSignatureParser, parametersToSkipNumber: Int) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.AnnotationsCollectorMethodVisitor[ClassConstructorDescriptorImpl]

'member' @ [109:64] ==> val member: BinaryJavaMethodBase defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'parentContext' @ [109:72] ==> value-parameter parentContext: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'signatureParser' @ [109:87] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[ValueParameterDescriptorImpl]

'paramIgnoreCount' @ [109:104] ==> val paramIgnoreCount: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.create[LocalVariableDescriptor]

'signatureParser' @ [117:30] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'mapAsmType' @ [117:46] ==> public final fun mapAsmType(type: Type, context: ClassifierResolutionContext): JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[SimpleFunctionDescriptorImpl]

'getReturnType' @ [117:62] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [117:76] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'context' @ [117:83] ==> value-parameter context: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'getArgumentTypes' @ [118:39] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [118:56] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'map' @ [118:62] ==> public inline fun <T, R> Array<out (Type..Type?)>.map(transform: ((Type..Type?)) -> JavaType): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <R> -> JavaType

'signatureParser' @ [118:68] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'mapAsmType' @ [118:84] ==> public final fun mapAsmType(type: Type, context: ClassifierResolutionContext): JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[SimpleFunctionDescriptorImpl]

'it' @ [118:95] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [118:99] ==> value-parameter context: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[ValueParameterDescriptorImpl]

'MethodInfo' @ [120:20] ==> public constructor MethodInfo(returnType: JavaType, typeParameters: List<JavaTypeParameter>, valueParameterTypes: List<JavaType>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[ClassConstructorDescriptorImpl]

'returnType' @ [120:31] ==> val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[LocalVariableDescriptor]

'emptyList' @ [120:43] ==> public fun <T> emptyList(): List<JavaTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter

'parameterTypes' @ [120:56] ==> val parameterTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodDescription[LocalVariableDescriptor]

'StringCharacterIterator' @ [128:28] ==> public constructor StringCharacterIterator(p0: (String..String?)) defined in java.text.StringCharacterIterator[JavaClassConstructorDescriptor]

'signature' @ [128:52] ==> value-parameter signature: String defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'signatureParser' @ [129:34] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'parseTypeParametersDeclaration' @ [129:50] ==> public final fun parseTypeParametersDeclaration(signature: CharacterIterator, context: ClassifierResolutionContext): List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[SimpleFunctionDescriptorImpl]

'iterator' @ [129:81] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'context' @ [129:91] ==> value-parameter context: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'iterator' @ [131:17] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'current' @ [131:26] ==> public open fun current(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'ClsFormatException' @ [131:50] ==> public constructor ClsFormatException() defined in com.intellij.util.cls.ClsFormatException[JavaClassConstructorDescriptor]

'iterator' @ [132:13] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'next' @ [132:22] ==> public open fun next(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'if (iterator.current() == ')') {
                paramTypes = emptyList()
            }
            else {
                    paramTypes = ContainerUtil.newArrayList()
                while (iterator.current() != ')' && iterator.current() != CharacterIterator.DONE) {
                    paramTypes.add(signatureParser.parseTypeString(iterator, context))
                }
                if (iterator.current() != ')') throw ClsFormatException()

                paramTypes = (paramTypes as ArrayList).compact()
            }' @ [134:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'iterator' @ [134:17] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'current' @ [134:26] ==> public open fun current(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'paramTypes' @ [135:17] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'emptyList' @ [135:30] ==> public fun <T> emptyList(): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'paramTypes' @ [138:21] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'newArrayList' @ [138:48] ==> @NotNull @Contract public open fun <T : (Any..Any?)> newArrayList(): ArrayList<(JavaType..JavaType?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaType

'iterator' @ [139:24] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'current' @ [139:33] ==> public open fun current(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'iterator' @ [139:53] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'current' @ [139:62] ==> public open fun current(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'DONE' @ [139:93] ==> public const final val DONE: Char defined in java.text.CharacterIterator[JavaPropertyDescriptor]

'paramTypes' @ [140:21] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'add' @ [140:32] ==> public open fun add(element: (JavaType..JavaType?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'signatureParser' @ [140:36] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'parseTypeString' @ [140:52] ==> public final fun parseTypeString(signature: CharacterIterator, context: ClassifierResolutionContext): JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[SimpleFunctionDescriptorImpl]

'iterator' @ [140:68] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'context' @ [140:78] ==> value-parameter context: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'iterator' @ [142:21] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'current' @ [142:30] ==> public open fun current(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'ClsFormatException' @ [142:54] ==> public constructor ClsFormatException() defined in com.intellij.util.cls.ClsFormatException[JavaClassConstructorDescriptor]

'paramTypes' @ [144:17] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'paramTypes' @ [144:31] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'compact' @ [144:56] ==> public fun <T> ArrayList<JavaType>.compact(): List<JavaType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'iterator' @ [146:13] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'next' @ [146:22] ==> public open fun next(): Char defined in java.text.StringCharacterIterator[JavaMethodDescriptor]

'signatureParser' @ [148:30] ==> value-parameter signatureParser: BinaryClassSignatureParser defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'parseTypeString' @ [148:46] ==> public final fun parseTypeString(signature: CharacterIterator, context: ClassifierResolutionContext): JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryClassSignatureParser[SimpleFunctionDescriptorImpl]

'iterator' @ [148:62] ==> val iterator: StringCharacterIterator defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'context' @ [148:72] ==> value-parameter context: ClassifierResolutionContext defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[ValueParameterDescriptorImpl]

'MethodInfo' @ [150:20] ==> public constructor MethodInfo(returnType: JavaType, typeParameters: List<JavaTypeParameter>, valueParameterTypes: List<JavaType>) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.MethodInfo[ClassConstructorDescriptorImpl]

'returnType' @ [150:31] ==> val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'typeParameters' @ [150:43] ==> val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'paramTypes' @ [150:59] ==> var paramTypes: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase.Companion.parseMethodSignature[LocalVariableDescriptor]

'BinaryJavaMethodBase' @ [162:5] ==> public constructor BinaryJavaMethodBase(access: Int, containingClass: JavaClass, valueParameters: List<JavaValueParameter>, typeParameters: List<JavaTypeParameter>, name: Name) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase[ClassConstructorDescriptorImpl]

'flags' @ [163:9] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [163:16] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod.<init>[ValueParameterDescriptorImpl]

'valueParameters' @ [163:33] ==> value-parameter valueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod.<init>[ValueParameterDescriptorImpl]

'typeParameters' @ [163:50] ==> value-parameter typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod.<init>[ValueParameterDescriptorImpl]

'name' @ [163:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethod.<init>[ValueParameterDescriptorImpl]

'BinaryJavaMethodBase' @ [173:5] ==> public constructor BinaryJavaMethodBase(access: Int, containingClass: JavaClass, valueParameters: List<JavaValueParameter>, typeParameters: List<JavaTypeParameter>, name: Name) defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaMethodBase[ClassConstructorDescriptorImpl]

'flags' @ [174:9] ==> value-parameter flags: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaConstructor.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [174:16] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaConstructor.<init>[ValueParameterDescriptorImpl]

'valueParameters' @ [174:33] ==> value-parameter valueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaConstructor.<init>[ValueParameterDescriptorImpl]

'typeParameters' @ [174:50] ==> value-parameter typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaConstructor.<init>[ValueParameterDescriptorImpl]

'NO_NAME_PROVIDED' @ [175:22] ==> public final val NO_NAME_PROVIDED: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

