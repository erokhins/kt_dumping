'JavaClassifierImpl<PsiClass>' @ [31:43] ==> protected/*protected and package*/ constructor JavaClassifierImpl<Psi : (PsiClass..PsiClass?)>(@NotNull psiClass: PsiClass) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassifierImpl[JavaClassConstructorDescriptor]
Inferred types:
    <Psi : (PsiClass..PsiClass?)> -> PsiClass

'psiClass' @ [31:72] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<init>[ValueParameterDescriptorImpl]

'assert' @ [33:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [33:16] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<init>[ValueParameterDescriptorImpl]

'psi' @ [37:17] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'innerClasses' @ [37:21] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'mapNotNull' @ [37:34] ==> public inline fun <T, R : Any> Array<out (PsiClass..PsiClass?)>.mapNotNull(transform: ((PsiClass..PsiClass?)) -> Name?): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R : Any> -> Name

'it' @ [37:47] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-innerClassNames>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [37:50] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'takeIf' @ [37:56] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeIf(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Name' @ [37:63] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'let' @ [37:89] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'Name' @ [37:93] ==> private constructor Name(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.name.Name[JavaClassConstructorDescriptor]

'psi' @ [40:16] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'findInnerClassByName' @ [40:20] ==> @Nullable public abstract fun findInnerClassByName(@NonNls p0: (String..String?), p1: Boolean): PsiClass? defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'name' @ [40:41] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.findInnerClass[ValueParameterDescriptorImpl]

'asString' @ [40:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'let' @ [40:66] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> JavaClassImpl): JavaClassImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> JavaClassImpl

'psi' @ [45:33] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'qualifiedName' @ [45:37] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'if (qualifiedName == null) null else FqName(qualifiedName)' @ [46:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'qualifiedName' @ [46:24] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-fqName>[LocalVariableDescriptor]

'FqName' @ [46:57] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'qualifiedName' @ [46:64] ==> val qualifiedName: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-fqName>[LocalVariableDescriptor]

'safeName' @ [50:27] ==> @NotNull public open fun safeName(@Nullable p0: String?): Name defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'psi' @ [50:36] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'name' @ [50:40] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'psi' @ [53:17] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'isInterface' @ [53:21] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'psi' @ [56:17] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'isAnnotationType' @ [56:21] ==> public final val PsiClass.isAnnotationType: Boolean[MyPropertyDescriptor]

'psi' @ [59:17] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'isEnum' @ [59:21] ==> public final val PsiClass.isEnum: Boolean[MyPropertyDescriptor]

'psi' @ [63:25] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'containingClass' @ [63:29] ==> public final val PsiClass.containingClass: PsiClass?[MyPropertyDescriptor]

'if (outer == null) null else JavaClassImpl(outer)' @ [64:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaClassImpl?, elseBranch: JavaClassImpl?): JavaClassImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaClassImpl?

'outer' @ [64:24] ==> val outer: PsiClass? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-outerClass>[LocalVariableDescriptor]

'JavaClassImpl' @ [64:49] ==> public constructor JavaClassImpl(psiClass: PsiClass) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[ClassConstructorDescriptorImpl]

'outer' @ [64:63] ==> val outer: PsiClass? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-outerClass>[LocalVariableDescriptor]

'typeParameters' @ [68:17] ==> internal fun typeParameters(typeParameters: Array<PsiTypeParameter>): List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]

'psi' @ [68:32] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'typeParameters' @ [68:36] ==> public final val PsiClass.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'classifierTypes' @ [71:17] ==> internal fun classifierTypes(classTypes: Array<PsiClassType>): Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]

'psi' @ [71:33] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'superTypes' @ [71:37] ==> public final val PsiClass.superTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'assertNotLightClass' @ [75:13] ==> private final fun assertNotLightClass(): Unit defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[SimpleFunctionDescriptorImpl]

'methods' @ [78:20] ==> internal fun methods(methods: Collection<PsiMethod>): Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]

'psi' @ [78:28] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'methods' @ [78:32] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'filter' @ [78:40] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'!' @ [78:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [78:60] ==> value-parameter method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'isConstructor' @ [78:67] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [78:84] ==> value-parameter method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [78:91] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'distinct' @ [78:113] ==> public fun <T> Iterable<JavaMethod>.distinct(): List<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'assertNotLightClass' @ [83:13] ==> private final fun assertNotLightClass(): Unit defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[SimpleFunctionDescriptorImpl]

'fields' @ [84:20] ==> internal fun fields(fields: Collection<PsiField>): Collection<JavaField> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]

'psi' @ [84:27] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'fields' @ [84:31] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'filter' @ [84:38] ==> public inline fun <T> Array<out (PsiField..PsiField?)>.filter(predicate: ((PsiField..PsiField?)) -> Boolean): List<(PsiField..PsiField?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'field' @ [85:28] ==> value-parameter field: (PsiField..PsiField?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [85:34] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'name' @ [87:17] ==> val name: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-fields>.<anonymous>[LocalVariableDescriptor]

'isValidIdentifier' @ [87:38] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [87:56] ==> val name: String? defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-fields>.<anonymous>[LocalVariableDescriptor]

'assertNotLightClass' @ [93:13] ==> private final fun assertNotLightClass(): Unit defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[SimpleFunctionDescriptorImpl]

'constructors' @ [96:20] ==> internal fun constructors(methods: Collection<PsiMethod>): Collection<JavaConstructor> defined in org.jetbrains.kotlin.load.java.structure.impl[SimpleFunctionDescriptorImpl]

'psi' @ [96:33] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'constructors' @ [96:37] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'filter' @ [96:50] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'method' @ [96:69] ==> value-parameter method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'isConstructor' @ [96:76] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'isAbstract' @ [100:33] ==> public open fun isAbstract(@NotNull owner: JavaModifierListOwnerImpl): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.JavaElementUtil[JavaMethodDescriptor]

'this' @ [100:44] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[LazyClassReceiverParameterDescriptor]

'isStatic' @ [103:33] ==> public open fun isStatic(@NotNull owner: JavaModifierListOwnerImpl): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.JavaElementUtil[JavaMethodDescriptor]

'this' @ [103:42] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[LazyClassReceiverParameterDescriptor]

'isFinal' @ [106:33] ==> public open fun isFinal(@NotNull owner: JavaModifierListOwnerImpl): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.JavaElementUtil[JavaMethodDescriptor]

'this' @ [106:41] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[LazyClassReceiverParameterDescriptor]

'getVisibility' @ [109:33] ==> @NotNull public open fun getVisibility(@NotNull owner: JavaModifierListOwnerImpl): Visibility defined in org.jetbrains.kotlin.load.java.structure.impl.JavaElementUtil[JavaMethodDescriptor]

'this' @ [109:47] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[LazyClassReceiverParameterDescriptor]

'psi' @ [112:18] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'originKind' @ [112:47] ==> public abstract val originKind: LightClassOriginKind defined in org.jetbrains.kotlin.asJava.KtLightClassMarker[PropertyDescriptorImpl]

'psi' @ [115:18] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'containingFile' @ [115:22] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [115:38] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'psi' @ [117:73] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'containingFile' @ [117:77] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [117:92] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'scope' @ [117:107] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.isFromSourceCodeInScope[ValueParameterDescriptorImpl]

'psi' @ [119:44] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'modifierList' @ [119:48] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'psi' @ [122:24] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'psiClass' @ [123:13] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.assertNotLightClass[LocalVariableDescriptor]

'psiClass' @ [125:67] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.assertNotLightClass[LocalVariableDescriptor]

'psiClass' @ [125:86] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.assertNotLightClass[LocalVariableDescriptor]

'java' @ [125:102] ==> public val <T> KClass<out PsiClass>.java: Class<out PsiClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiClass

'psiClass' @ [125:126] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.assertNotLightClass[LocalVariableDescriptor]

'containingFile' @ [125:135] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [125:151] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [125:164] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'LOGGER' @ [126:9] ==> private final val LOGGER: Logger defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.Companion[PropertyDescriptorImpl]

'error' @ [126:16] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'message' @ [126:22] ==> val message: String defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl.assertNotLightClass[LocalVariableDescriptor]

'getInstance' @ [130:37] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'JavaClassImpl' @ [130:49] ==> public companion object defined in org.jetbrains.kotlin.load.java.structure.impl.JavaClassImpl[FakeCallableDescriptorForObject]

'java' @ [130:70] ==> public val <T> KClass<JavaClassImpl>.java: Class<JavaClassImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaClassImpl

