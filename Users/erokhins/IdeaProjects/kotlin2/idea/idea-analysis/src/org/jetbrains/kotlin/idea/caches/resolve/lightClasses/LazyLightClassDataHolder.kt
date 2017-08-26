'lazyPub' @ [44:40] ==> public fun <T> lazyPub(initializer: () -> LightClassBuilderResult): Lazy<LightClassBuilderResult> defined in org.jetbrains.kotlin.asJava.classes[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LightClassBuilderResult

'invoke' @ [44:50] ==> public abstract operator fun invoke(p1: LightClassConstructionContext): LightClassBuilderResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [44:58] ==> public abstract operator fun invoke(): LightClassConstructionContext defined in kotlin.Function0[FunctionInvokeDescriptor]

'exactResultLazyValue' @ [46:57] ==> private final val exactResultLazyValue: Lazy<LightClassBuilderResult> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'getValue' @ [48:38] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'dummyContextProvider' @ [49:9] ==> value-parameter dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.<init>[ValueParameterDescriptorImpl]

'let' @ [49:31] ==> @InlineOnly public inline fun <T, R> (DummyLightClassContextProvider /* = () -> LightClassConstructionContext? */).let(block: (DummyLightClassContextProvider /* = () -> LightClassConstructionContext? */) -> LightClassBuilderResult?): LightClassBuilderResult? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<LightClassConstructionContext?>
    <R> -> LightClassBuilderResult?

'invoke' @ [49:49] ==> public abstract operator fun invoke(): LightClassConstructionContext? defined in kotlin.Function0[FunctionInvokeDescriptor]

'let' @ [49:61] ==> @InlineOnly public inline fun <T, R> LightClassConstructionContext.let(block: (LightClassConstructionContext) -> LightClassBuilderResult): LightClassBuilderResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LightClassConstructionContext
    <R> -> LightClassBuilderResult

'builder' @ [49:78] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.<init>[ValueParameterDescriptorImpl]

'invoke' @ [49:86] ==> public abstract operator fun invoke(p1: LightClassConstructionContext): LightClassBuilderResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'context' @ [49:93] ==> value-parameter context: LightClassConstructionContext defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.lazyInexactResult.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (exactResultLazyValue.isInitialized()) null else lazyInexactResult' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LightClassBuilderResult?, elseBranch: LightClassBuilderResult?): LightClassBuilderResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LightClassBuilderResult?

'exactResultLazyValue' @ [53:21] ==> private final val exactResultLazyValue: Lazy<LightClassBuilderResult> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'isInitialized' @ [53:42] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'lazyInexactResult' @ [53:69] ==> private final val lazyInexactResult: LightClassBuilderResult? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'exactResult' @ [55:39] ==> private final val exactResult: LightClassBuilderResult defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'stub' @ [55:51] ==> public final val stub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedPropertyDescriptor]

'exactResult' @ [56:43] ==> private final val exactResult: LightClassBuilderResult defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'diagnostics' @ [56:55] ==> public final val diagnostics: Diagnostics defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedPropertyDescriptor]

'LazyLightClassData' @ [60:13] ==> public constructor LazyLightClassData(findDelegate: (LightClassBuilderResult) -> PsiClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[ClassConstructorDescriptorImpl]

'invoke' @ [61:17] ==> public abstract operator fun invoke(p1: PsiJavaFileStub): PsiClass defined in kotlin.Function1[FunctionInvokeDescriptor]

'lightClassBuilderResult' @ [61:30] ==> value-parameter lightClassBuilderResult: LightClassBuilderResult defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.findData.<anonymous>[ValueParameterDescriptorImpl]

'stub' @ [61:54] ==> public final val stub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedPropertyDescriptor]

'LazyLightClassDataHolder' @ [66:9] ==> private constructor LazyLightClassDataHolder(builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */, exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */, dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[ClassConstructorDescriptorImpl]

'builder' @ [66:34] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass.<init>[ValueParameterDescriptorImpl]

'exactContextProvider' @ [66:43] ==> value-parameter exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass.<init>[ValueParameterDescriptorImpl]

'dummyContextProvider' @ [66:65] ==> value-parameter dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass.<init>[ValueParameterDescriptorImpl]

'LazyLightClassData' @ [68:17] ==> public constructor LazyLightClassData(findDelegate: (LightClassBuilderResult) -> PsiClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[ClassConstructorDescriptorImpl]

'lightClassBuilderResult' @ [69:21] ==> value-parameter lightClassBuilderResult: LightClassBuilderResult defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass.findDataForClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'stub' @ [69:45] ==> public final val stub: PsiJavaFileStub defined in org.jetbrains.kotlin.asJava.builder.LightClassBuilderResult[DeserializedPropertyDescriptor]

'findDelegate' @ [69:50] ==> public fun PsiJavaFileStub.findDelegate(classOrObject: KtClassOrObject): PsiClass defined in org.jetbrains.kotlin.asJava.builder[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [69:63] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForClass.findDataForClassOrObject[ValueParameterDescriptorImpl]

'LazyLightClassDataHolder' @ [75:9] ==> private constructor LazyLightClassDataHolder(builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */, exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */, dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[ClassConstructorDescriptorImpl]

'builder' @ [75:34] ==> value-parameter builder: LightClassBuilder /* = (LightClassConstructionContext) -> LightClassBuilderResult */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForFacade.<init>[ValueParameterDescriptorImpl]

'exactContextProvider' @ [75:43] ==> value-parameter exactContextProvider: ExactLightClassContextProvider /* = () -> LightClassConstructionContext */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForFacade.<init>[ValueParameterDescriptorImpl]

'dummyContextProvider' @ [75:65] ==> value-parameter dummyContextProvider: DummyLightClassContextProvider /* = (() -> LightClassConstructionContext?)? */ defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.ForFacade.<init>[ValueParameterDescriptorImpl]

'getValue' @ [80:47] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [80:57] ==> public abstract operator fun invoke(p1: LightClassBuilderResult): PsiClass defined in kotlin.Function1[FunctionInvokeDescriptor]

'exactResult' @ [80:70] ==> private final val exactResult: LightClassBuilderResult defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'getValue' @ [82:49] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'inexactResult' @ [82:59] ==> private final val inexactResult: LightClassBuilderResult? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[PropertyDescriptorImpl]

'let' @ [82:74] ==> @InlineOnly public inline fun <T, R> LightClassBuilderResult.let(block: (LightClassBuilderResult) -> PsiClass): PsiClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LightClassBuilderResult
    <R> -> PsiClass

'findDelegate' @ [82:78] ==> value-parameter findDelegate: (LightClassBuilderResult) -> PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.<init>[ValueParameterDescriptorImpl]

'dummyDelegate' @ [85:17] ==> private final val dummyDelegate: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'KtLightFieldImpl' @ [85:47] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl[FakeCallableDescriptorForObject]

'fromClsFields' @ [85:64] ==> public final fun fromClsFields(delegateClass: PsiClass, containingClass: KtLightClass): List<KtLightField> defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl.Factory[DeserializedSimpleFunctionDescriptor]

'clsDelegate' @ [85:78] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'containingClass' @ [85:91] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields[ValueParameterDescriptorImpl]

'dummyDelegate' @ [87:20] ==> private final val dummyDelegate: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'fields' @ [87:36] ==> public final val PsiClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'map' @ [87:43] ==> public inline fun <T, R> Array<out (PsiField..PsiField?)>.map(transform: ((PsiField..PsiField?)) -> KtLightField): List<KtLightField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <R> -> KtLightField

'!!' @ [88:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LightMemberOriginForDeclaration?): LightMemberOriginForDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LightMemberOriginForDeclaration

'getOrigin' @ [88:52] ==> public final fun getOrigin(field: PsiField): LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl.Factory[DeserializedSimpleFunctionDescriptor]

'dummyField' @ [88:62] ==> value-parameter dummyField: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'dummyField' @ [90:33] ==> value-parameter dummyField: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [90:44] ==> public final val PsiField.name: String?[MyPropertyDescriptor]

'KtLightFieldImpl' @ [91:17] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl[FakeCallableDescriptorForObject]

'lazy' @ [91:34] ==> public final fun lazy(dummyDelegate: PsiField, origin: LightMemberOriginForDeclaration, containingClass: KtLightClass, computeRealDelegate: () -> PsiField): KtLightField defined in org.jetbrains.kotlin.asJava.elements.KtLightFieldImpl.Factory[DeserializedSimpleFunctionDescriptor]

'dummyField' @ [91:39] ==> value-parameter dummyField: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'fieldOrigin' @ [91:51] ==> val fieldOrigin: LightMemberOriginForDeclaration defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[LocalVariableDescriptor]

'containingClass' @ [91:64] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields[ValueParameterDescriptorImpl]

'clsDelegate' @ [92:21] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'findFieldByName' @ [92:33] ==> @Nullable public abstract fun findFieldByName(@NonNls p0: (String..String?), p1: Boolean): PsiField? defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'fieldName' @ [92:49] ==> val fieldName: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[LocalVariableDescriptor]

'assertMatches' @ [92:67] ==> private final fun <T : PsiMember> PsiField?.assertMatches(dummyMember: (PsiField..PsiField?), containingClass: KtLightClass): (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiMember> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)

'dummyField' @ [92:81] ==> value-parameter dummyField: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [92:93] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnFields[ValueParameterDescriptorImpl]

'dummyDelegate' @ [98:17] ==> private final val dummyDelegate: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'KtLightMethodImpl' @ [98:47] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'fromClsMethods' @ [98:65] ==> public final fun fromClsMethods(delegateClass: PsiClass, containingClass: KtLightClass): List<KtLightMethodImpl> defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[DeserializedSimpleFunctionDescriptor]

'clsDelegate' @ [98:80] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'containingClass' @ [98:93] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods[ValueParameterDescriptorImpl]

'dummyDelegate' @ [100:20] ==> private final val dummyDelegate: PsiClass? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'methods' @ [100:36] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'map' @ [100:44] ==> public inline fun <T, R> Array<out (PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> KtLightMethodImpl): List<KtLightMethodImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> KtLightMethodImpl

'KtLightMethodImpl' @ [101:36] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'getOrigin' @ [101:54] ==> public final fun getOrigin(method: PsiMethod): LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[DeserializedSimpleFunctionDescriptor]

'dummyMethod' @ [101:64] ==> value-parameter dummyMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'KtLightMethodImpl' @ [103:17] ==> public companion object Factory defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl[FakeCallableDescriptorForObject]

'lazy' @ [103:35] ==> public final fun lazy(dummyDelegate: PsiMethod?, containingClass: KtLightClass, origin: LightMemberOriginForDeclaration?, computeRealDelegate: () -> PsiMethod): KtLightMethodImpl defined in org.jetbrains.kotlin.asJava.elements.KtLightMethodImpl.Factory[DeserializedSimpleFunctionDescriptor]

'dummyMethod' @ [103:40] ==> value-parameter dummyMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [103:53] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods[ValueParameterDescriptorImpl]

'methodOrigin' @ [103:70] ==> val methodOrigin: LightMemberOriginForDeclaration? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[LocalVariableDescriptor]

'dummyMethod' @ [104:38] ==> value-parameter dummyMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'memberIndex' @ [104:50] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder[DeserializedPropertyDescriptor]

'it' @ [106:67] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'memberIndex' @ [106:70] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder[DeserializedPropertyDescriptor]

'dummyIndex' @ [106:85] ==> val dummyIndex: MemberIndex defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>.<anonymous>[LocalVariableDescriptor]

'clsDelegate' @ [113:47] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'findMethodsByName' @ [113:59] ==> @NotNull public abstract fun findMethodsByName(@NonNls p0: (String..String?), p1: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'dummyMethod' @ [113:77] ==> value-parameter dummyMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [113:89] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'firstOrNull' @ [113:102] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'byMemberIndex' @ [113:114] ==> val byMemberIndex: (PsiMethod) -> Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>.<anonymous>[LocalVariableDescriptor]

'clsDelegate' @ [114:50] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData[PropertyDescriptorImpl]

'methods' @ [114:62] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [114:70] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'byMemberIndex' @ [114:82] ==> val byMemberIndex: (PsiMethod) -> Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>.<anonymous>[LocalVariableDescriptor]

'exactDelegateMethod' @ [115:21] ==> val exactDelegateMethod: PsiMethod? defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertMatches' @ [115:41] ==> private final fun <T : PsiMember> PsiMethod?.assertMatches(dummyMember: (PsiMethod..PsiMethod?), containingClass: KtLightClass): (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiMember> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'dummyMethod' @ [115:55] ==> value-parameter dummyMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [115:68] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.LazyLightClassData.getOwnMethods[ValueParameterDescriptorImpl]

'this' @ [122:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ReceiverParameterDescriptorImpl]

'NoMatch' @ [122:67] ==> public constructor NoMatch(dummyMember: PsiMember, containingClass: KtLightClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.NoMatch[ClassConstructorDescriptorImpl]

'dummyMember' @ [122:75] ==> value-parameter dummyMember: T defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'containingClass' @ [122:88] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'?:' @ [124:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'this' @ [124:38] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ReceiverParameterDescriptorImpl]

'parameterList' @ [124:59] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [124:74] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'?:' @ [125:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Any?

'dummyMember' @ [125:18] ==> value-parameter dummyMember: T defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'parameterList' @ [125:46] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [125:61] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'this' @ [126:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ReceiverParameterDescriptorImpl]

'memberIndex' @ [126:18] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder[DeserializedPropertyDescriptor]

'dummyMember' @ [126:33] ==> value-parameter dummyMember: T defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'memberIndex' @ [126:45] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder[DeserializedPropertyDescriptor]

'!' @ [126:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterCountMatches' @ [126:61] ==> val parameterCountMatches: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[LocalVariableDescriptor]

'WrongMatch' @ [127:53] ==> public constructor WrongMatch(realMember: PsiMember, dummyMember: PsiMember, containingClass: KtLightClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.WrongMatch[ClassConstructorDescriptorImpl]

'this' @ [127:64] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ReceiverParameterDescriptorImpl]

'dummyMember' @ [127:70] ==> value-parameter dummyMember: T defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'containingClass' @ [127:83] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ValueParameterDescriptorImpl]

'this' @ [130:16] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassDataHolder.assertMatches[ReceiverParameterDescriptorImpl]

'AssertionError' @ [135:7] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'message' @ [135:22] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [138:9] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.<init>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [138:25] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'hasLightClassMatchingErrors' @ [138:39] ==> public var KtClassOrObject.hasLightClassMatchingErrors: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LazyLightClassDataHolder.kt[PropertyDescriptorImpl]

'LazyLightClassMemberMatchingError' @ [141:76] ==> private constructor LazyLightClassMemberMatchingError(message: String, containingClass: KtLightClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError[ClassConstructorDescriptorImpl]

'dummyMember' @ [142:31] ==> value-parameter dummyMember: PsiMember defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.NoMatch.<init>[ValueParameterDescriptorImpl]

'debugName' @ [142:43] ==> private val PsiMember.debugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LazyLightClassDataHolder.kt[PropertyDescriptorImpl]

'containingClass' @ [142:58] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.NoMatch.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [142:76] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.NoMatch.<init>[ValueParameterDescriptorImpl]

'LazyLightClassMemberMatchingError' @ [145:102] ==> private constructor LazyLightClassMemberMatchingError(message: String, containingClass: KtLightClass) defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError[ClassConstructorDescriptorImpl]

'dummyMember' @ [146:24] ==> value-parameter dummyMember: PsiMember defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.WrongMatch.<init>[ValueParameterDescriptorImpl]

'debugName' @ [146:36] ==> private val PsiMember.debugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LazyLightClassDataHolder.kt[PropertyDescriptorImpl]

'realMember' @ [146:52] ==> value-parameter realMember: PsiMember defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.WrongMatch.<init>[ValueParameterDescriptorImpl]

'debugName' @ [146:63] ==> private val PsiMember.debugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses in file LazyLightClassDataHolder.kt[PropertyDescriptorImpl]

'containingClass' @ [146:78] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.WrongMatch.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [146:96] ==> value-parameter containingClass: KtLightClass defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.LazyLightClassMemberMatchingError.WrongMatch.<init>[ValueParameterDescriptorImpl]

'+' @ [151:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [151:16] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.debugName[ReceiverParameterDescriptorImpl]

'java' @ [151:28] ==> public val <T> KClass<out PsiMember>.java: Class<out PsiMember> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out PsiMember)

'simpleName' @ [151:33] ==> public final val <T : (Any..Any?)> Class<out PsiMember>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out PsiMember)

'this' @ [151:47] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.debugName[ReceiverParameterDescriptorImpl]

'name' @ [151:52] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'this' @ [151:60] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.debugName[ReceiverParameterDescriptorImpl]

'memberIndex' @ [151:65] ==> public val PsiMember.memberIndex: MemberIndex? defined in org.jetbrains.kotlin.asJava.builder[DeserializedPropertyDescriptor]

'if (this is PsiMethod) " (with ${parameterList.parametersCount} parameters)" else ""' @ [151:81] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [151:85] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.lightClasses.debugName[ReceiverParameterDescriptorImpl]

'parameterList' @ [151:114] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [151:128] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'getValue' @ [153:61] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T defined in org.jetbrains.kotlin.psi.NotNullableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [153:93] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

