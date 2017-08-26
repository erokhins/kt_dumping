'KtLightMemberImpl<PsiMethod>' @ [43:5] ==> public constructor KtLightMemberImpl<out D : PsiMember>(computeRealDelegate: () -> PsiMethod, lightMemberOrigin: LightMemberOrigin?, containingClass: KtLightClass, dummyDelegate: PsiMethod?) defined in org.jetbrains.kotlin.asJava.elements.KtLightMemberImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : PsiMember> -> PsiMethod

'computeRealDelegate' @ [43:34] ==> value-parameter computeRealDelegate: () -> PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.<init>[ValueParameterDescriptorImpl]

'lightMemberOrigin' @ [43:55] ==> value-parameter lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [43:74] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.<init>[ValueParameterDescriptorImpl]

'dummyDelegate' @ [43:91] ==> value-parameter dummyDelegate: PsiMethod? = ... defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.<init>[ValueParameterDescriptorImpl]

'lazyPub' @ [44:35] ==> public fun <T> lazyPub(initializer: () -> ClsTypeElementImpl?): Lazy<ClsTypeElementImpl?> defined in org.jetbrains.kotlin.asJava.classes[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClsTypeElementImpl?

'clsDelegate' @ [45:35] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'returnTypeElement' @ [45:47] ==> public final val PsiMethod.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'delegateTypeElement' @ [46:9] ==> val delegateTypeElement: ClsTypeElementImpl? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.returnTypeElem.<anonymous>[LocalVariableDescriptor]

'let' @ [46:30] ==> @InlineOnly public inline fun <T, R> ClsTypeElementImpl.let(block: (ClsTypeElementImpl) -> ClsTypeElementImpl): ClsTypeElementImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClsTypeElementImpl
    <R> -> ClsTypeElementImpl

'ClsTypeElementImpl' @ [46:36] ==> public constructor ClsTypeElementImpl(@NotNull p0: PsiElement, @NotNull p1: String, p2: Char) defined in com.intellij.psi.impl.compiled.ClsTypeElementImpl[JavaClassConstructorDescriptor]

'this' @ [46:55] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'it' @ [46:61] ==> value-parameter it: ClsTypeElementImpl defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.returnTypeElem.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalText' @ [46:64] ==> public final val ClsTypeElementImpl.canonicalText: (String..String?)[MyPropertyDescriptor]

'toChar' @ [46:119] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ThreadLocal' @ [49:41] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'lazyPub' @ [51:49] ==> public fun <T> lazyPub(initializer: () -> KtLightParameterList): Lazy<KtLightParameterList> defined in org.jetbrains.kotlin.asJava.classes[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtLightParameterList

'KtLightParameterList' @ [52:9] ==> public constructor KtLightParameterList(parent: KtLightMethod, parametersCount: Int, computeParameters: () -> List<PsiParameter>) defined in org.jetbrains.kotlin.asJava.elements.KtLightParameterList[ClassConstructorDescriptorImpl]

'this' @ [52:30] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'dummyDelegate' @ [52:36] ==> private final val dummyDelegate: PsiMethod? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'parameterList' @ [52:51] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [52:66] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'clsDelegate' @ [52:85] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'parameterList' @ [52:97] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [52:111] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'clsDelegate' @ [53:13] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'parameterList' @ [53:25] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [53:39] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'mapIndexed' @ [53:50] ==> public inline fun <T, R> Array<out (PsiParameter..PsiParameter?)>.mapIndexed(transform: (index: Int, (PsiParameter..PsiParameter?)) -> KtLightParameter): List<KtLightParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> KtLightParameter

'KtLightParameter' @ [53:86] ==> public constructor KtLightParameter(delegate: (PsiParameter..PsiParameter?), index: Int, method: (KtLightMethod..KtLightMethod?)) defined in org.jetbrains.kotlin.asJava.elements.KtLightParameter[JavaClassConstructorDescriptor]

'clsParameter' @ [53:103] ==> value-parameter clsParameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.paramsList.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [53:117] ==> value-parameter index: Int defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.paramsList.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this@KtLightMethodImpl' @ [53:124] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'lazyPub' @ [57:70] ==> public fun <T> lazyPub(initializer: () -> CachedValue<PsiTypeParameterList>): Lazy<CachedValue<PsiTypeParameterList>> defined in org.jetbrains.kotlin.asJava.classes[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CachedValue<PsiTypeParameterList>

'getManager' @ [58:48] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'clsDelegate' @ [58:59] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'project' @ [58:71] ==> public final val PsiMethod.project: Project[MyPropertyDescriptor]

'cacheManager' @ [59:9] ==> val cacheManager: (CachedValuesManager..CachedValuesManager?) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.typeParamsList.<anonymous>[LocalVariableDescriptor]

'createCachedValue' @ [59:22] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(PsiTypeParameterList..PsiTypeParameterList?)>?, p1: Boolean): CachedValue<(PsiTypeParameterList..PsiTypeParameterList?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiTypeParameterList

'lightMemberOrigin' @ [61:35] ==> value-parameter lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.<init>[ValueParameterDescriptorImpl]

'originalElement' @ [61:91] ==> public open val originalElement: KtDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'if (origin != null) {
                        if (origin is KtClassOrObject) {
                            KotlinLightTypeParameterListBuilder(manager)
                        }
                        else {
                            LightClassUtil.buildLightTypeParameterList(this@KtLightMethodImpl, origin)
                        }
                    }
                    else {
                        clsDelegate.typeParameterList
                    }' @ [62:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiTypeParameterList?, elseBranch: PsiTypeParameterList?): PsiTypeParameterList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiTypeParameterList?

'origin' @ [62:36] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.typeParamsList.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (origin is KtClassOrObject) {
                            KotlinLightTypeParameterListBuilder(manager)
                        }
                        else {
                            LightClassUtil.buildLightTypeParameterList(this@KtLightMethodImpl, origin)
                        }' @ [63:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiTypeParameterList, elseBranch: PsiTypeParameterList): PsiTypeParameterList[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiTypeParameterList

'origin' @ [63:29] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.typeParamsList.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinLightTypeParameterListBuilder' @ [64:29] ==> public constructor KotlinLightTypeParameterListBuilder(manager: PsiManager) defined in org.jetbrains.kotlin.asJava.elements.KotlinLightTypeParameterListBuilder[ClassConstructorDescriptorImpl]

'manager' @ [64:65] ==> public final val KtLightMethodImpl.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'LightClassUtil' @ [67:29] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava in file LightClassUtil.kt[FakeCallableDescriptorForObject]

'buildLightTypeParameterList' @ [67:44] ==> public final fun buildLightTypeParameterList(owner: PsiTypeParameterListOwner, declaration: KtDeclaration): PsiTypeParameterList defined in org.jetbrains.kotlin.asJava.LightClassUtil[SimpleFunctionDescriptorImpl]

'this@KtLightMethodImpl' @ [67:72] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'origin' @ [67:96] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.typeParamsList.<anonymous>.<anonymous>[LocalVariableDescriptor]

'clsDelegate' @ [71:25] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'typeParameterList' @ [71:37] ==> public final val PsiMethod.typeParameterList: PsiTypeParameterList?[MyPropertyDescriptor]

'create' @ [73:48] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: PsiTypeParameterList?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(PsiTypeParameterList..PsiTypeParameterList?)>..CachedValueProvider.Result<(PsiTypeParameterList..PsiTypeParameterList?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiTypeParameterList

'list' @ [73:55] ==> val list: PsiTypeParameterList? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.typeParamsList.<anonymous>.<anonymous>[LocalVariableDescriptor]

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [73:84] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'if (visitor is JavaElementVisitor) {
            visitor.visitMethod(this)
        }
        else {
            visitor.visitElement(this)
        }' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'visitor' @ [79:13] ==> value-parameter visitor: PsiElementVisitor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.accept[ValueParameterDescriptorImpl]

'visitor' @ [80:13] ==> value-parameter visitor: PsiElementVisitor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.accept[ValueParameterDescriptorImpl]

'visitMethod' @ [80:21] ==> public open fun visitMethod(p0: (PsiMethod..PsiMethod?)): Unit defined in com.intellij.psi.JavaElementVisitor[JavaMethodDescriptor]

'this' @ [80:33] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'visitor' @ [83:13] ==> value-parameter visitor: PsiElementVisitor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.accept[ValueParameterDescriptorImpl]

'visitElement' @ [83:21] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElementVisitor[JavaMethodDescriptor]

'this' @ [83:34] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'modifierList' @ [88:33] ==> public final val KtLightMethodImpl.modifierList: PsiModifierList[MyPropertyDescriptor]

'findAnnotation' @ [88:46] ==> @Nullable public abstract fun findAnnotation(@NotNull @NonNls p0: String): PsiAnnotation? defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'JVM_NAME' @ [88:77] ==> public final val JVM_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'asString' @ [88:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'propertyNameByAccessor' @ [89:32] ==> public fun propertyNameByAccessor(name: String, accessor: KtLightMethod): String? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [89:55] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[ValueParameterDescriptorImpl]

'this' @ [89:61] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'name' @ [89:70] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[ValueParameterDescriptorImpl]

'newNameForOrigin' @ [90:13] ==> val newNameForOrigin: String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'kotlinOrigin' @ [90:33] ==> public open val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'name' @ [90:47] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'jvmNameAnnotation' @ [91:13] ==> val jvmNameAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'delete' @ [91:32] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiAnnotation[JavaMethodDescriptor]

'this' @ [92:20] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'jvmNameAnnotation' @ [94:30] ==> val jvmNameAnnotation: PsiAnnotation? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'findAttributeValue' @ [94:49] ==> @Nullable public abstract fun findAttributeValue(@Nullable @NonNls p0: String?): PsiAnnotationMemberValue? defined in com.intellij.psi.PsiAnnotation[JavaMethodDescriptor]

'unwrapped' @ [94:77] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava in file lightClassUtils.kt[PropertyDescriptorImpl]

'if (nameExpression != null) {
            nameExpression.replace(KtPsiFactory(this).createStringTemplate(name))
        }
        else {
            val toRename = kotlinOrigin as? PsiNamedElement ?: cannotModify()
            toRename.setName(newNameForOrigin)
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'nameExpression' @ [95:13] ==> val nameExpression: KtStringTemplateExpression? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'nameExpression' @ [96:13] ==> val nameExpression: KtStringTemplateExpression? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'replace' @ [96:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [96:36] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [96:49] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'createStringTemplate' @ [96:55] ==> public final fun createStringTemplate(content: String): KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [96:76] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [99:28] ==> public open val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'cannotModify' @ [99:64] ==> public fun LightElement.cannotModify(): Nothing defined in org.jetbrains.kotlin.asJava.classes in file implUtils.kt[SimpleFunctionDescriptorImpl]

'toRename' @ [100:13] ==> val toRename: PsiNamedElement defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'setName' @ [100:22] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiNamedElement[JavaMethodDescriptor]

'newNameForOrigin' @ [100:30] ==> val newNameForOrigin: String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.setName[LocalVariableDescriptor]

'this' @ [102:16] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'kotlinOrigin' @ [106:9] ==> public open val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'let' @ [106:23] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Unit

'it' @ [107:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.delete.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [107:20] ==> public final val KtDeclaration.isValid: Boolean[MyPropertyDescriptor]

'it' @ [108:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.delete.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [108:20] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'cannotModify' @ [110:14] ==> public fun LightElement.cannotModify(): Nothing defined in org.jetbrains.kotlin.asJava.classes in file implUtils.kt[SimpleFunctionDescriptorImpl]

'calculatingReturnType' @ [114:13] ==> private final val calculatingReturnType: ThreadLocal<Boolean> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'get' @ [114:35] ==> public open fun get(): (Boolean..Boolean?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'getInstance' @ [115:40] ==> public open fun getInstance(p0: (Project..Project?)): (KotlinJavaPsiFacade..KotlinJavaPsiFacade?) defined in org.jetbrains.kotlin.resolve.jvm.KotlinJavaPsiFacade[JavaMethodDescriptor]

'project' @ [115:52] ==> public final val KtLightMethodImpl.project: Project[MyPropertyDescriptor]

'emptyModifierList' @ [115:61] ==> public final val KotlinJavaPsiFacade.emptyModifierList: (LightModifierList..LightModifierList?)[MyPropertyDescriptor]

'super' @ [117:16] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'getModifierList' @ [117:22] ==> public open fun getModifierList(): PsiModifierList defined in org.jetbrains.kotlin.asJava.elements.KtLightMemberImpl[SimpleFunctionDescriptorImpl]

'paramsList' @ [120:39] ==> private final val paramsList: PsiParameterList defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'typeParamsList' @ [122:43] ==> private final val typeParamsList: CachedValue<PsiTypeParameterList> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'value' @ [122:58] ==> public final val <T : (Any..Any?)> CachedValue<PsiTypeParameterList>.value: (PsiTypeParameterList..PsiTypeParameterList?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiTypeParameterList

'typeParameterList' @ [125:13] ==> public final val KtLightMethodImpl.typeParameterList: (PsiTypeParameterList..PsiTypeParameterList?)[MyPropertyDescriptor]

'typeParameters' @ [125:32] ==> public final val PsiTypeParameterList.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [125:67] ==> public final val EMPTY_ARRAY: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in com.intellij.psi.PsiTypeParameter[JavaPropertyDescriptor]

'substitutor' @ [128:13] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.getSignature[ValueParameterDescriptorImpl]

'EMPTY' @ [128:43] ==> @NotNull public final val EMPTY: PsiSubstitutor defined in com.intellij.psi.PsiSubstitutor[JavaPropertyDescriptor]

'clsDelegate' @ [129:20] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'getSignature' @ [129:32] ==> @NotNull public abstract fun getSignature(@NotNull p0: PsiSubstitutor): MethodSignature defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'substitutor' @ [129:45] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.getSignature[ValueParameterDescriptorImpl]

'create' @ [131:49] ==> @NotNull public open fun create(@NotNull p0: PsiMethod, @NotNull p1: PsiSubstitutor): MethodSignatureBackedByPsiMethod defined in com.intellij.psi.util.MethodSignatureBackedByPsiMethod[JavaMethodDescriptor]

'this' @ [131:56] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'substitutor' @ [131:62] ==> value-parameter substitutor: PsiSubstitutor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.getSignature[ValueParameterDescriptorImpl]

'Factory' @ [135:16] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'create' @ [135:24] ==> public final fun create(delegate: PsiMethod, origin: LightMemberOrigin?, containingClass: KtLightClass): KtLightMethodImpl defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[SimpleFunctionDescriptorImpl]

'clsDelegate' @ [135:31] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'lightMemberOrigin' @ [135:44] ==> public open val lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'copy' @ [135:63] ==> public abstract fun copy(): LightMemberOrigin defined in org.jetbrains.kotlin.asJava.builder.LightMemberOrigin[SimpleFunctionDescriptorImpl]

'containingClass' @ [135:71] ==> public final val KtLightMethodImpl.containingClass: KtLightClass[MyPropertyDescriptor]

'typeParameters' @ [139:16] ==> public final val KtLightMethodImpl.typeParameters: Array<PsiTypeParameter>[MyPropertyDescriptor]

'all' @ [139:31] ==> public inline fun <T> Array<out PsiTypeParameter>.all(predicate: (PsiTypeParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiTypeParameter

'processor' @ [139:37] ==> value-parameter processor: PsiScopeProcessor defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.processDeclarations[ValueParameterDescriptorImpl]

'execute' @ [139:47] ==> public abstract fun execute(@NotNull p0: PsiElement, @NotNull p1: ResolveState): Boolean defined in com.intellij.psi.scope.PsiScopeProcessor[JavaMethodDescriptor]

'it' @ [139:55] ==> value-parameter it: PsiTypeParameter defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.processDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [139:59] ==> value-parameter state: ResolveState defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.processDeclarations[ValueParameterDescriptorImpl]

'dummyDelegate' @ [143:18] ==> private final val dummyDelegate: PsiMethod? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'clsDelegate' @ [143:35] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'memberIndex' @ [143:48] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder in file MemberIndex.kt[PropertyDescriptorImpl]

'this' @ [150:13] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'other' @ [150:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'other' @ [151:14] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'this' @ [152:14] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'name' @ [152:19] ==> public final var KtLightMethodImpl.name: String[MyPropertyDescriptor]

'other' @ [152:27] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'name' @ [152:33] ==> public final var KtLightMethodImpl.name: String[MyPropertyDescriptor]

'this' @ [153:14] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'containingClass' @ [153:19] ==> public final val KtLightMethodImpl.containingClass: KtLightClass[MyPropertyDescriptor]

'other' @ [153:38] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'containingClass' @ [153:44] ==> public final val KtLightMethodImpl.containingClass: KtLightClass[MyPropertyDescriptor]

'this' @ [154:14] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'lightMemberOrigin' @ [154:19] ==> public open val lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'other' @ [154:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'lightMemberOrigin' @ [154:46] ==> public open val lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'this' @ [155:14] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[LazyClassReceiverParameterDescriptor]

'_memberIndex' @ [155:19] ==> private final val _memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'other' @ [155:35] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.equals[ValueParameterDescriptorImpl]

'_memberIndex' @ [155:41] ==> private final val _memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'*' @ [157:36] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'*' @ [157:37] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getName' @ [157:38] ==> public open fun getName(): String defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[SimpleFunctionDescriptorImpl]

'hashCode' @ [157:48] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'lightMemberOrigin' @ [157:67] ==> public open val lightMemberOrigin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'hashCode' @ [157:86] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.asJava.builder.LightMemberOrigin[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [157:111] ==> public final val KtLightMethodImpl.containingClass: KtLightClass[MyPropertyDescriptor]

'hashCode' @ [157:127] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedSimpleFunctionDescriptor]

'_memberIndex' @ [157:147] ==> private final val _memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'hashCode' @ [157:161] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.asJava.builder.MemberIndex[SimpleFunctionDescriptorImpl]

'clsDelegate' @ [159:39] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'defaultValue' @ [159:77] ==> public final val PsiAnnotationMethod.defaultValue: PsiAnnotationMemberValue?[MyPropertyDescriptor]

'returnTypeElem' @ [163:60] ==> private final val returnTypeElem: ClsTypeElementImpl? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'calculatingReturnType' @ [166:9] ==> private final val calculatingReturnType: ThreadLocal<Boolean> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'set' @ [166:31] ==> public open fun set(p0: (Boolean..Boolean?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'returnTypeElement' @ [168:20] ==> public final val KtLightMethodImpl.returnTypeElement: PsiTypeElement?[MyPropertyDescriptor]

'type' @ [168:39] ==> public final val PsiTypeElement.type: PsiType[MyPropertyDescriptor]

'calculatingReturnType' @ [171:13] ==> private final val calculatingReturnType: ThreadLocal<Boolean> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'set' @ [171:35] ==> public open fun set(p0: (Boolean..Boolean?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'origin' @ [177:35] ==> value-parameter origin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[ValueParameterDescriptorImpl]

'originalElement' @ [177:43] ==> public open val originalElement: KtDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'originalElement' @ [178:17] ==> val originalElement: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[LocalVariableDescriptor]

'origin' @ [179:24] ==> value-parameter origin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[ValueParameterDescriptorImpl]

'copy' @ [179:31] ==> public final fun copy(originalElement: KtDeclaration = ..., originKind: JvmDeclarationOriginKind = ...): LightMemberOriginForDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[SimpleFunctionDescriptorImpl]

'originalElement' @ [179:36] ==> val originalElement: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[LocalVariableDescriptor]

'getStrictParentOfType' @ [179:52] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'origin' @ [179:91] ==> value-parameter origin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[ValueParameterDescriptorImpl]

'originKind' @ [179:98] ==> public open val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'origin' @ [181:20] ==> value-parameter origin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.adjustMethodOrigin[ValueParameterDescriptorImpl]

'KtLightMethodImpl' @ [187:20] ==> private constructor KtLightMethodImpl(computeRealDelegate: () -> PsiMethod, lightMemberOrigin: LightMemberOrigin?, containingClass: KtLightClass, dummyDelegate: PsiMethod? = ...) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[ClassConstructorDescriptorImpl]

'delegate' @ [187:40] ==> value-parameter delegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.create[ValueParameterDescriptorImpl]

'origin' @ [187:51] ==> value-parameter origin: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.create[ValueParameterDescriptorImpl]

'containingClass' @ [187:59] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.create[ValueParameterDescriptorImpl]

'KtLightMethodImpl' @ [196:20] ==> private constructor KtLightMethodImpl(computeRealDelegate: () -> PsiMethod, lightMemberOrigin: LightMemberOrigin?, containingClass: KtLightClass, dummyDelegate: PsiMethod? = ...) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[ClassConstructorDescriptorImpl]

'computeRealDelegate' @ [196:38] ==> value-parameter computeRealDelegate: () -> PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.lazy[ValueParameterDescriptorImpl]

'origin' @ [196:59] ==> value-parameter origin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.lazy[ValueParameterDescriptorImpl]

'containingClass' @ [196:67] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.lazy[ValueParameterDescriptorImpl]

'dummyDelegate' @ [196:84] ==> value-parameter dummyDelegate: PsiMethod? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.lazy[ValueParameterDescriptorImpl]

'delegateClass' @ [199:86] ==> value-parameter delegateClass: PsiClass defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.fromClsMethods[ValueParameterDescriptorImpl]

'methods' @ [199:100] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'map' @ [199:108] ==> public inline fun <T, R> Array<out (PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> KtLightMethodImpl): List<KtLightMethodImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> KtLightMethodImpl

'KtLightMethodImpl' @ [200:13] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'create' @ [200:31] ==> public final fun create(delegate: PsiMethod, origin: LightMemberOrigin?, containingClass: KtLightClass): KtLightMethodImpl defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[SimpleFunctionDescriptorImpl]

'it' @ [200:38] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.fromClsMethods.<anonymous>[ValueParameterDescriptorImpl]

'getOrigin' @ [200:42] ==> public final fun getOrigin(method: PsiMethod): LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[SimpleFunctionDescriptorImpl]

'it' @ [200:52] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.fromClsMethods.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [200:57] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.fromClsMethods[ValueParameterDescriptorImpl]

'adjustMethodOrigin' @ [203:44] ==> private final fun adjustMethodOrigin(origin: LightMemberOriginForDeclaration?): LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[SimpleFunctionDescriptorImpl]

'getMemberOrigin' @ [203:63] ==> internal fun getMemberOrigin(member: PsiMember): LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements in file KtLightMemberImpl.kt[SimpleFunctionDescriptorImpl]

'method' @ [203:79] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory.getOrigin[ValueParameterDescriptorImpl]

'clsDelegate' @ [206:36] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'throwsList' @ [206:48] ==> public final val PsiMethod.throwsList: PsiReferenceList[MyPropertyDescriptor]

'clsDelegate' @ [208:40] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'hasTypeParameters' @ [208:52] ==> public abstract fun hasTypeParameters(): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'dummyDelegate' @ [210:33] ==> private final val dummyDelegate: PsiMethod? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'clsDelegate' @ [210:50] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'isVarArgs' @ [210:63] ==> public final val PsiMethod.isVarArgs: Boolean[MyPropertyDescriptor]

'dummyDelegate' @ [212:36] ==> private final val dummyDelegate: PsiMethod? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'isConstructor' @ [212:51] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'clsDelegate' @ [212:68] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'isConstructor' @ [212:80] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'clsDelegate' @ [214:53] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'hierarchicalMethodSignature' @ [214:65] ==> public final val PsiMethod.hierarchicalMethodSignature: HierarchicalMethodSignature[MyPropertyDescriptor]

'clsDelegate' @ [216:83] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findSuperMethodSignaturesIncludingStatic' @ [216:95] ==> @NotNull public abstract fun findSuperMethodSignaturesIncludingStatic(p0: Boolean): (MutableList<(MethodSignatureBackedByPsiMethod..MethodSignatureBackedByPsiMethod?)>..List<(MethodSignatureBackedByPsiMethod..MethodSignatureBackedByPsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'checkAccess' @ [216:136] ==> value-parameter checkAccess: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.findSuperMethodSignaturesIncludingStatic[ValueParameterDescriptorImpl]

'clsDelegate' @ [220:45] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findDeepestSuperMethod' @ [220:57] ==> @Nullable @Deprecated public abstract fun findDeepestSuperMethod(): PsiMethod? defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'clsDelegate' @ [222:46] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findDeepestSuperMethods' @ [222:58] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'clsDelegate' @ [224:39] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findSuperMethods' @ [224:51] ==> @NotNull public abstract fun findSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'clsDelegate' @ [226:59] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findSuperMethods' @ [226:71] ==> @NotNull public abstract fun findSuperMethods(p0: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'checkAccess' @ [226:88] ==> value-parameter checkAccess: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.findSuperMethods[ValueParameterDescriptorImpl]

'clsDelegate' @ [228:61] ==> public open val clsDelegate: PsiMethod defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[PropertyDescriptorImpl]

'findSuperMethods' @ [228:73] ==> @NotNull public abstract fun findSuperMethods(p0: (PsiClass..PsiClass?)): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'parentClass' @ [228:90] ==> value-parameter parentClass: PsiClass? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.findSuperMethods[ValueParameterDescriptorImpl]

'this' @ [232:24] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [232:29] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[PropertyDescriptorImpl]

'!' @ [233:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'methodOrigin' @ [233:11] ==> val methodOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'methodOrigin' @ [233:46] ==> val methodOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'methodOrigin' @ [233:84] ==> val methodOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'getParentOfType' @ [237:44] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtClassOrObject..KtClassOrObject?)>): KtClassOrObject? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtClassOrObject

'methodOrigin' @ [237:60] ==> val methodOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'java' @ [237:97] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'this' @ [238:32] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[ReceiverParameterDescriptorImpl]

'containingClass' @ [238:37] ==> public final val KtLightMethod.containingClass: KtLightClass[MyPropertyDescriptor]

'kotlinOrigin' @ [238:53] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[PropertyDescriptorImpl]

'parentOfMethodOrigin' @ [241:13] ==> val parentOfMethodOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'thisClassDeclaration' @ [241:45] ==> val thisClassDeclaration: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'parentOfMethodOrigin' @ [241:70] ==> val parentOfMethodOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'isTrait' @ [241:104] ==> public open fun isTrait(@NotNull p0: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parentOfMethodOrigin' @ [241:112] ==> val parentOfMethodOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.elements.isTraitFakeOverride[LocalVariableDescriptor]

'kotlinOrigin' @ [245:18] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[PropertyDescriptorImpl]

'origin' @ [246:9] ==> val origin: KtCallableDeclaration defined in org.jetbrains.kotlin.asJava.elements.isAccessor[LocalVariableDescriptor]

'origin' @ [246:34] ==> val origin: KtCallableDeclaration defined in org.jetbrains.kotlin.asJava.elements.isAccessor[LocalVariableDescriptor]

'+' @ [247:35] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (getter) 0 else 1' @ [247:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'getter' @ [247:40] ==> value-parameter getter: Boolean defined in org.jetbrains.kotlin.asJava.elements.isAccessor[ValueParameterDescriptorImpl]

'if (origin.receiverTypeReference != null) 1 else 0' @ [247:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'origin' @ [247:65] ==> val origin: KtCallableDeclaration defined in org.jetbrains.kotlin.asJava.elements.isAccessor[LocalVariableDescriptor]

'receiverTypeReference' @ [247:72] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'parameterList' @ [248:12] ==> public final val KtLightMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [248:26] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'expectedParametersCount' @ [248:45] ==> val expectedParametersCount: Int defined in org.jetbrains.kotlin.asJava.elements.isAccessor[LocalVariableDescriptor]

'isAccessor' @ [252:13] ==> public fun KtLightMethod.isAccessor(getter: Boolean): Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightMethodImpl.kt[SimpleFunctionDescriptorImpl]

'isAccessor' @ [255:13] ==> public fun KtLightMethod.isAccessor(getter: Boolean): Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightMethodImpl.kt[SimpleFunctionDescriptorImpl]

