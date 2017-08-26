'AbstractJavaUClass' @ [34:5] ==> public constructor AbstractJavaUClass() defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedClassConstructorDescriptor]

'psi' @ [34:39] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.<init>[ValueParameterDescriptorImpl]

'psi' @ [36:19] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.<init>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [36:23] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'unwrap' @ [38:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiClass): PsiClass defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UClass
    <reified P : PsiElement> -> PsiClass

'psi' @ [38:49] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.<init>[ValueParameterDescriptorImpl]

'super' @ [41:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [41:22] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'UastLightIdentifier' @ [44:40] ==> public constructor UastLightIdentifier(lightOwner: PsiNameIdentifierOwner, ktDeclaration: KtNamedDeclaration?) defined in org.jetbrains.uast.kotlin.declarations.UastLightIdentifier[ClassConstructorDescriptorImpl]

'psi' @ [44:60] ==> public open val psi: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'ktClass' @ [44:65] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'ktClass' @ [46:50] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'containingFile' @ [46:59] ==> public final val KtClassOrObject.containingFile: PsiFile[MyPropertyDescriptor]

'psi' @ [46:77] ==> public open val psi: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'containingFile' @ [46:81] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'ktClass' @ [49:17] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'annotationEntries' @ [49:26] ==> public final val KtClassOrObject.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'map' @ [49:45] ==> public inline fun <T, R> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.map(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> KotlinUAnnotation): List<KotlinUAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R> -> KotlinUAnnotation

'KotlinUAnnotation' @ [49:51] ==> public constructor KotlinUAnnotation(psi: KtAnnotationEntry, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[ClassConstructorDescriptorImpl]

'it' @ [49:69] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.uast.kotlin.KotlinUClass.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [49:73] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'emptyList' @ [49:84] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

'UIdentifier' @ [52:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'psi' @ [52:29] ==> public open val psi: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'nameIdentifier' @ [52:33] ==> public final val PsiClass.nameIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'this' @ [52:49] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'psi' @ [57:16] ==> public open val psi: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'innerClasses' @ [57:20] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'filter' @ [57:33] ==> public inline fun <T> Array<out (PsiClass..PsiClass?)>.filter(predicate: ((PsiClass..PsiClass?)) -> Boolean): List<(PsiClass..PsiClass?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'it' @ [58:13] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.uast.kotlin.KotlinUClass.getInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [58:16] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'DEFAULT_IMPLS_CLASS_NAME' @ [58:31] ==> public const final val DEFAULT_IMPLS_CLASS_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'!' @ [58:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [58:60] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.uast.kotlin.KotlinUClass.getInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'isEnumEntryLightClass' @ [58:63] ==> private final fun PsiClass.isEnumEntryLightClass(): Boolean defined in org.jetbrains.uast.kotlin.KotlinUClass[SimpleFunctionDescriptorImpl]

'map' @ [59:11] ==> public inline fun <T, R> Iterable<(PsiClass..PsiClass?)>.map(transform: ((PsiClass..PsiClass?)) -> UClass): List<UClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)
    <R> -> UClass

'getLanguagePlugin' @ [60:13] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convert' @ [60:33] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convert(element: PsiElement, parent: UElement?): UClass defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UClass

'it' @ [60:49] ==> value-parameter it: (PsiClass..PsiClass?) defined in org.jetbrains.uast.kotlin.KotlinUClass.getInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [60:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'toTypedArray' @ [61:11] ==> public inline fun <reified T> Collection<UClass>.toTypedArray(): Array<UClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UClass

'super' @ [64:45] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'getSuperClass' @ [64:51] ==> public open fun getSuperClass(): UClass? defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super' @ [65:47] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'getFields' @ [65:53] ==> public open fun getFields(): Array<UField> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super' @ [66:64] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'getInitializers' @ [66:70] ==> public open fun getInitializers(): Array<UClassInitializer> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'ktClass' @ [69:34] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'primaryConstructor' @ [69:43] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'toLightMethods' @ [69:63] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [69:81] ==> public fun <T> List<PsiMethod>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'ktClass' @ [70:26] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'getAnonymousInitializers' @ [70:35] ==> public final fun getAnonymousInitializers(): List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [70:65] ==> public fun <T> emptyList(): List<KtAnonymousInitializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'if (psiMethod is KtLightMethod && psiMethod.isConstructor && initBlocks.isNotEmpty()
                    && (primaryConstructor == null || psiMethod == primaryConstructor)) {
                object : KotlinUMethod(psiMethod, this@KotlinUClass) {
                    override val uastBody by lz {
                        val initializers = ktClass?.getAnonymousInitializers() ?: return@lz UastEmptyExpression
                        val containingMethod = this

                        object : UBlockExpression {
                            override val psi: PsiElement?
                                 get() = null

                            override val uastParent: UElement?
                                get() = containingMethod

                            override val annotations: List<UAnnotation>
                                get() = emptyList()

                            override val expressions by lz {
                                initializers.map {
                                    getLanguagePlugin().convertOpt<UExpression>(it.body, this) ?: UastEmptyExpression
                                }
                            }
                        }
                    }
                }
            } else {
                getLanguagePlugin().convert(psiMethod, this)
            }' @ [73:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UMethod, elseBranch: UMethod): UMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UMethod

'psiMethod' @ [73:24] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod[ValueParameterDescriptorImpl]

'psiMethod' @ [73:54] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod[ValueParameterDescriptorImpl]

'isConstructor' @ [73:64] ==> public final val KtLightMethod.isConstructor: Boolean[MyPropertyDescriptor]

'initBlocks' @ [73:81] ==> val initBlocks: List<KtAnonymousInitializer> defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods[LocalVariableDescriptor]

'isNotEmpty' @ [73:92] ==> @InlineOnly public inline fun <T> Collection<KtAnonymousInitializer>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'primaryConstructor' @ [74:25] ==> val primaryConstructor: PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods[LocalVariableDescriptor]

'psiMethod' @ [74:55] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod[ValueParameterDescriptorImpl]

'primaryConstructor' @ [74:68] ==> val primaryConstructor: PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods[LocalVariableDescriptor]

'KotlinUMethod' @ [75:26] ==> public constructor KotlinUMethod(psi: KtLightMethod, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.declarations.KotlinUMethod[ClassConstructorDescriptorImpl]

'psiMethod' @ [75:40] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod[ValueParameterDescriptorImpl]

'this@KotlinUClass' @ [75:51] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'getValue' @ [76:46] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'ktClass' @ [77:44] ==> public final val ktClass: KtClassOrObject? defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'getAnonymousInitializers' @ [77:53] ==> public final fun getAnonymousInitializers(): List<KtAnonymousInitializer> defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'UastEmptyExpression' @ [77:93] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'this' @ [78:48] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'containingMethod' @ [85:41] ==> val containingMethod: <no name provided> defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod.<no name provided>.uastBody.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [88:41] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

'getValue' @ [90:57] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'initializers' @ [91:33] ==> val initializers: List<KtAnonymousInitializer> defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod.<no name provided>.uastBody.<anonymous>[LocalVariableDescriptor]

'map' @ [91:46] ==> public inline fun <T, R> Iterable<KtAnonymousInitializer>.map(transform: (KtAnonymousInitializer) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer
    <R> -> UExpression

'getLanguagePlugin' @ [92:37] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertOpt' @ [92:57] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UExpression? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UExpression

'it' @ [92:81] ==> value-parameter it: KtAnonymousInitializer defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod.<no name provided>.uastBody.<anonymous>.<no name provided>.expressions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [92:84] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'this' @ [92:90] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod.<no name provided>.uastBody.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'UastEmptyExpression' @ [92:99] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'getLanguagePlugin' @ [99:17] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convert' @ [99:37] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convert(element: PsiElement, parent: UElement?): UMethod defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UMethod

'psiMethod' @ [99:45] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.createUMethod[ValueParameterDescriptorImpl]

'this' @ [99:56] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass[LazyClassReceiverParameterDescriptor]

'psiMethod' @ [103:55] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.isDelegatedMethod[ValueParameterDescriptorImpl]

'psiMethod' @ [103:85] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods.isDelegatedMethod[ValueParameterDescriptorImpl]

'isDelegated' @ [103:95] ==> public open val isDelegated: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'psi' @ [105:16] ==> public open val psi: PsiClass defined in org.jetbrains.uast.kotlin.KotlinUClass[PropertyDescriptorImpl]

'methods' @ [105:20] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'asSequence' @ [105:28] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asSequence(): Sequence<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'filterNot' @ [106:18] ==> public fun <T> Sequence<(PsiMethod..PsiMethod?)>.filterNot(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Sequence<(PsiMethod..PsiMethod?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'isDelegatedMethod' @ [106:30] ==> local final fun isDelegatedMethod(psiMethod: PsiMethod): Boolean defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods[SimpleFunctionDescriptorImpl]

'map' @ [107:18] ==> public fun <T, R> Sequence<(PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> UMethod): Sequence<UMethod> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> UMethod

'createUMethod' @ [107:24] ==> local final fun createUMethod(psiMethod: PsiMethod): UMethod defined in org.jetbrains.uast.kotlin.KotlinUClass.getMethods[SimpleFunctionDescriptorImpl]

'toList' @ [108:18] ==> public fun <T> Sequence<UMethod>.toList(): List<UMethod> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UMethod

'toTypedArray' @ [109:18] ==> public inline fun <reified T> Collection<UMethod>.toTypedArray(): Array<UMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UMethod

'this' @ [112:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUClass.isEnumEntryLightClass[ReceiverParameterDescriptorImpl]

'kotlinOrigin' @ [112:77] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'if (psi is PsiAnonymousClass)
                KotlinUAnonymousClass(psi, containingElement)
            else
                KotlinUClass(psi, containingElement)' @ [116:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UClass, elseBranch: UClass): UClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UClass

'psi' @ [116:24] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion.create[ValueParameterDescriptorImpl]

'KotlinUAnonymousClass' @ [117:17] ==> public constructor KotlinUAnonymousClass(psi: PsiAnonymousClass, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[ClassConstructorDescriptorImpl]

'psi' @ [117:39] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion.create[ValueParameterDescriptorImpl]

'containingElement' @ [117:44] ==> value-parameter containingElement: UElement? defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion.create[ValueParameterDescriptorImpl]

'KotlinUClass' @ [119:17] ==> private constructor KotlinUClass(psi: KtLightClass, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUClass[ClassConstructorDescriptorImpl]

'psi' @ [119:30] ==> value-parameter psi: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion.create[ValueParameterDescriptorImpl]

'containingElement' @ [119:35] ==> value-parameter containingElement: UElement? defined in org.jetbrains.uast.kotlin.KotlinUClass.Companion.create[ValueParameterDescriptorImpl]

'AbstractJavaUClass' @ [127:5] ==> public constructor AbstractJavaUClass() defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedClassConstructorDescriptor]

'psi' @ [127:65] ==> value-parameter psi: PsiAnonymousClass defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass.<init>[ValueParameterDescriptorImpl]

'unwrap' @ [129:43] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiAnonymousClass): PsiAnonymousClass defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UAnonymousClass
    <reified P : PsiElement> -> PsiAnonymousClass

'psi' @ [129:86] ==> value-parameter psi: PsiAnonymousClass defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass.<init>[ValueParameterDescriptorImpl]

'super<AbstractJavaUClass>' @ [132:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [132:42] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super<AbstractJavaUClass>' @ [135:45] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getSuperClass' @ [135:71] ==> public open fun getSuperClass(): UClass? defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super<AbstractJavaUClass>' @ [136:47] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getFields' @ [136:73] ==> public open fun getFields(): Array<UField> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super<AbstractJavaUClass>' @ [137:49] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getMethods' @ [137:75] ==> public open fun getMethods(): Array<UMethod> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super<AbstractJavaUClass>' @ [138:64] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getInitializers' @ [138:90] ==> public open fun getInitializers(): Array<UClassInitializer> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'super<AbstractJavaUClass>' @ [139:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

'getInnerClasses' @ [139:79] ==> public open fun getInnerClasses(): Array<UClass> defined in org.jetbrains.uast.java.AbstractJavaUClass[DeserializedSimpleFunctionDescriptor]

'?:' @ [143:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtObjectDeclaration?, right: KtObjectDeclaration): KtObjectDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtObjectDeclaration

'psi' @ [143:36] ==> public open val psi: PsiAnonymousClass defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[PropertyDescriptorImpl]

'originalElement' @ [143:40] ==> public final val PsiAnonymousClass.originalElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'kotlinOrigin' @ [143:75] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'UIdentifier' @ [144:20] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'ktClassOrObject' @ [144:32] ==> val ktClassOrObject: KtObjectDeclaration defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass.<get-uastAnchor>[LocalVariableDescriptor]

'getObjectKeyword' @ [144:48] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'this' @ [144:68] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnonymousClass[LazyClassReceiverParameterDescriptor]

