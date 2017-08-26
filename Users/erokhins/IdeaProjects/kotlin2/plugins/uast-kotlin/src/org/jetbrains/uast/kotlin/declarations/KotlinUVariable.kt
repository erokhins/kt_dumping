'psi' @ [39:23] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'when (psi) {
                is UastKotlinPsiVariable -> psi.ktInitializer
                is UastKotlinPsiParameter -> psi.ktDefaultValue
                is KtLightElement<*, *> -> {
                    val origin = psi.kotlinOrigin
                    when (origin) {
                        is KtVariableDeclaration -> origin.initializer
                        is KtParameter -> origin.defaultValue
                        else -> null
                    }
                }
                else -> null
            }' @ [40:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'psi' @ [40:47] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'psi' @ [41:45] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'ktInitializer' @ [41:49] ==> public final val ktInitializer: KtExpression? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'psi' @ [42:46] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'ktDefaultValue' @ [42:50] ==> public final val ktDefaultValue: KtExpression? defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter[PropertyDescriptorImpl]

'psi' @ [44:34] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'kotlinOrigin' @ [44:38] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'when (origin) {
                        is KtVariableDeclaration -> origin.initializer
                        is KtParameter -> origin.defaultValue
                        else -> null
                    }' @ [45:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'origin' @ [45:27] ==> val origin: KtElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'origin' @ [46:53] ==> val origin: KtElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'initializer' @ [46:60] ==> public final val KtVariableDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'origin' @ [47:43] ==> val origin: KtElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'defaultValue' @ [47:50] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'getLanguagePlugin' @ [53:20] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertElement' @ [53:40] ==> public abstract fun convertElement(element: PsiElement, parent: UElement?, requiredType: Class<out UElement>? = ...): UElement? defined in org.jetbrains.uast.UastLanguagePlugin[DeserializedSimpleFunctionDescriptor]

'initializerExpression' @ [53:55] ==> val initializerExpression: KtExpression defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.<get-uastInitializer>[LocalVariableDescriptor]

'this' @ [53:78] ==> <this> defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[LazyClassReceiverParameterDescriptor]

'UastEmptyExpression' @ [53:103] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'lz' @ [56:45] ==> internal fun <T> lz(initializer: () -> UExpression?): Lazy<UExpression?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression?

'psi' @ [57:19] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'when (psi) {
            is KtLightElement<*, *> -> (psi.kotlinOrigin as? KtProperty)?.delegateExpression
            is UastKotlinPsiVariable -> (psi.ktElement as? KtProperty)?.delegateExpression
            else -> null
        }' @ [58:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'psi' @ [58:32] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.delegateExpression.<anonymous>[LocalVariableDescriptor]

'psi' @ [59:41] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.delegateExpression.<anonymous>[LocalVariableDescriptor]

'kotlinOrigin' @ [59:45] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'delegateExpression' @ [59:75] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'psi' @ [60:42] ==> val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.delegateExpression.<anonymous>[LocalVariableDescriptor]

'ktElement' @ [60:46] ==> public final val ktElement: KtElement defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[PropertyDescriptorImpl]

'delegateExpression' @ [60:73] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [64:9] ==> val expression: KtExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.delegateExpression.<anonymous>[LocalVariableDescriptor]

'let' @ [64:21] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> UExpression?

'getLanguagePlugin' @ [64:27] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertElement' @ [64:47] ==> public abstract fun convertElement(element: PsiElement, parent: UElement?, requiredType: Class<out UElement>? = ...): UElement? defined in org.jetbrains.uast.UastLanguagePlugin[DeserializedSimpleFunctionDescriptor]

'it' @ [64:62] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.delegateExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [64:66] ==> <this> defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[LazyClassReceiverParameterDescriptor]

'psi' @ [68:29] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'kotlinOrigin' @ [68:60] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'UastLightIdentifier' @ [69:16] ==> public constructor UastLightIdentifier(lightOwner: PsiNameIdentifierOwner, ktDeclaration: KtNamedDeclaration?) defined in org.jetbrains.uast.kotlin.declarations.UastLightIdentifier[ClassConstructorDescriptorImpl]

'psi' @ [69:36] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'kotlinOrigin' @ [69:41] ==> val kotlinOrigin: KtElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.getNameIdentifier[LocalVariableDescriptor]

'lz' @ [72:52] ==> internal fun <T> lz(initializer: () -> List<JavaUAnnotation>): Lazy<List<JavaUAnnotation>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<JavaUAnnotation>

'psi' @ [72:57] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'annotations' @ [72:61] ==> public val PsiModifierListOwner.annotations: Array<PsiAnnotation> defined in org.jetbrains.uast.java[DeserializedPropertyDescriptor]

'map' @ [72:73] ==> public inline fun <T, R> Array<out PsiAnnotation>.map(transform: (PsiAnnotation) -> JavaUAnnotation): List<JavaUAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotation
    <R> -> JavaUAnnotation

'JavaUAnnotation' @ [72:79] ==> public constructor JavaUAnnotation(psi: PsiAnnotation, uastParent: UElement?) defined in org.jetbrains.uast.java.JavaUAnnotation[DeserializedClassConstructorDescriptor]

'it' @ [72:95] ==> value-parameter it: PsiAnnotation defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [72:99] ==> <this> defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[LazyClassReceiverParameterDescriptor]

'lz' @ [74:35] ==> internal fun <T> lz(initializer: () -> UTypeReferenceExpression?): Lazy<UTypeReferenceExpression?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UTypeReferenceExpression?

'getLanguagePlugin' @ [74:40] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertOpt' @ [74:60] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UTypeReferenceExpression? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UTypeReferenceExpression

'psi' @ [74:97] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'typeElement' @ [74:101] ==> public final val PsiVariable.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'this' @ [74:114] ==> <this> defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[LazyClassReceiverParameterDescriptor]

'UIdentifier' @ [77:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'psi' @ [77:29] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'nameIdentifier' @ [77:33] ==> public final val PsiVariable.nameIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'this' @ [77:49] ==> <this> defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[LazyClassReceiverParameterDescriptor]

'other' @ [79:40] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.equals[ValueParameterDescriptorImpl]

'psi' @ [79:76] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'other' @ [79:83] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable.equals[ValueParameterDescriptorImpl]

'psi' @ [79:89] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'psi' @ [81:31] ==> public abstract val psi: PsiVariable defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedPropertyDescriptor]

'hashCode' @ [81:35] ==> public open fun hashCode(): Int defined in com.intellij.psi.PsiVariable[DeserializedSimpleFunctionDescriptor]

'AbstractKotlinUVariable' @ [87:5] ==> public constructor AbstractKotlinUVariable() defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[ClassConstructorDescriptorImpl]

'psi' @ [87:58] ==> value-parameter psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable.<init>[ValueParameterDescriptorImpl]

'unwrap' @ [88:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiVariable): PsiVariable defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UVariable
    <reified P : PsiElement> -> PsiVariable

'psi' @ [88:55] ==> value-parameter psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable.<init>[ValueParameterDescriptorImpl]

'lz' @ [90:33] ==> internal fun <T> lz(initializer: () -> List<JavaUAnnotation>): Lazy<List<JavaUAnnotation>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<JavaUAnnotation>

'psi' @ [90:38] ==> value-parameter psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable.<init>[ValueParameterDescriptorImpl]

'annotations' @ [90:42] ==> public val PsiModifierListOwner.annotations: Array<PsiAnnotation> defined in org.jetbrains.uast.java[DeserializedPropertyDescriptor]

'map' @ [90:54] ==> public inline fun <T, R> Array<out PsiAnnotation>.map(transform: (PsiAnnotation) -> JavaUAnnotation): List<JavaUAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiAnnotation
    <R> -> JavaUAnnotation

'JavaUAnnotation' @ [90:60] ==> public constructor JavaUAnnotation(psi: PsiAnnotation, uastParent: UElement?) defined in org.jetbrains.uast.java.JavaUAnnotation[DeserializedClassConstructorDescriptor]

'it' @ [90:76] ==> value-parameter it: PsiAnnotation defined in org.jetbrains.uast.kotlin.KotlinUVariable.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [90:80] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUVariable[LazyClassReceiverParameterDescriptor]

'lz' @ [92:35] ==> internal fun <T> lz(initializer: () -> UTypeReferenceExpression?): Lazy<UTypeReferenceExpression?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UTypeReferenceExpression?

'getLanguagePlugin' @ [92:40] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertOpt' @ [92:60] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UTypeReferenceExpression? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UTypeReferenceExpression

'psi' @ [92:97] ==> value-parameter psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable.<init>[ValueParameterDescriptorImpl]

'typeElement' @ [92:101] ==> public final val PsiVariable.typeElement: PsiTypeElement?[MyPropertyDescriptor]

'this' @ [92:114] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUVariable[LazyClassReceiverParameterDescriptor]

'?:' @ [94:50] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile?): PsiFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile?

'psi' @ [94:51] ==> public open val psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable[PropertyDescriptorImpl]

'kotlinOrigin' @ [94:82] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'containingFile' @ [94:96] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'psi' @ [94:114] ==> public open val psi: PsiVariable defined in org.jetbrains.uast.kotlin.KotlinUVariable[PropertyDescriptorImpl]

'containingFile' @ [94:118] ==> public final val PsiVariable.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'super<AbstractKotlinUVariable>' @ [97:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUVariable[LazyClassReceiverParameterDescriptor]

'getInitializer' @ [97:47] ==> @Nullable public open fun getInitializer(): PsiExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[JavaMethodDescriptor]

'super<AbstractKotlinUVariable>' @ [101:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUVariable[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [101:47] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedSimpleFunctionDescriptor]

'super' @ [105:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUVariable[LazyClassReceiverParameterDescriptor]

'getNameIdentifier' @ [105:22] ==> public open fun getNameIdentifier(): PsiIdentifier defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[SimpleFunctionDescriptorImpl]

'AbstractKotlinUVariable' @ [112:5] ==> public constructor AbstractKotlinUVariable() defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[ClassConstructorDescriptorImpl]

'psi' @ [112:60] ==> value-parameter psi: PsiParameter defined in org.jetbrains.uast.kotlin.KotlinUParameter.<init>[ValueParameterDescriptorImpl]

'unwrap' @ [114:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiParameter): PsiParameter defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UParameter
    <reified P : PsiElement> -> PsiParameter

'psi' @ [114:57] ==> value-parameter psi: PsiParameter defined in org.jetbrains.uast.kotlin.KotlinUParameter.<init>[ValueParameterDescriptorImpl]

'super<AbstractKotlinUVariable>' @ [117:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUParameter[LazyClassReceiverParameterDescriptor]

'getInitializer' @ [117:47] ==> @Nullable public open fun getInitializer(): PsiExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[JavaMethodDescriptor]

'super<AbstractKotlinUVariable>' @ [121:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUParameter[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [121:47] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedSimpleFunctionDescriptor]

'super' @ [125:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUParameter[LazyClassReceiverParameterDescriptor]

'getNameIdentifier' @ [125:22] ==> public open fun getNameIdentifier(): PsiIdentifier defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[SimpleFunctionDescriptorImpl]

'AbstractKotlinUVariable' @ [132:5] ==> public constructor AbstractKotlinUVariable() defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[ClassConstructorDescriptorImpl]

'psi' @ [132:52] ==> value-parameter psi: PsiField defined in org.jetbrains.uast.kotlin.KotlinUField.<init>[ValueParameterDescriptorImpl]

'unwrap' @ [134:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiField): PsiField defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UField
    <reified P : PsiElement> -> PsiField

'psi' @ [134:49] ==> value-parameter psi: PsiField defined in org.jetbrains.uast.kotlin.KotlinUField.<init>[ValueParameterDescriptorImpl]

'super<AbstractKotlinUVariable>' @ [137:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUField[LazyClassReceiverParameterDescriptor]

'getInitializer' @ [137:47] ==> @Nullable public open fun getInitializer(): PsiExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[JavaMethodDescriptor]

'super<AbstractKotlinUVariable>' @ [141:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUField[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [141:47] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedSimpleFunctionDescriptor]

'super' @ [145:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUField[LazyClassReceiverParameterDescriptor]

'getNameIdentifier' @ [145:22] ==> public open fun getNameIdentifier(): PsiIdentifier defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[SimpleFunctionDescriptorImpl]

'?:' @ [152:50] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile?): PsiFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile?

'psi' @ [152:51] ==> public open val psi: PsiField defined in org.jetbrains.uast.kotlin.KotlinUField[PropertyDescriptorImpl]

'kotlinOrigin' @ [152:82] ==> public abstract val kotlinOrigin: KtElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[DeserializedPropertyDescriptor]

'containingFile' @ [152:96] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'psi' @ [152:114] ==> public open val psi: PsiField defined in org.jetbrains.uast.kotlin.KotlinUField[PropertyDescriptorImpl]

'containingFile' @ [152:118] ==> public final val PsiField.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'visitor' @ [155:13] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUField.accept[ValueParameterDescriptorImpl]

'visitField' @ [155:21] ==> public open fun visitField(node: UField): Boolean defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [155:32] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUField[LazyClassReceiverParameterDescriptor]

'annotations' @ [156:9] ==> public open val annotations: List<UAnnotation> defined in org.jetbrains.uast.kotlin.KotlinUField[PropertyDescriptorImpl]

'acceptList' @ [156:21] ==> public fun List<UElement>.acceptList(visitor: UastVisitor): Unit defined in org.jetbrains.uast.internal[DeserializedSimpleFunctionDescriptor]

'visitor' @ [156:32] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUField.accept[ValueParameterDescriptorImpl]

'uastInitializer' @ [157:9] ==> public open val uastInitializer: UExpression? defined in org.jetbrains.uast.kotlin.KotlinUField[PropertyDescriptorImpl]

'accept' @ [157:26] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [157:33] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUField.accept[ValueParameterDescriptorImpl]

'delegateExpression' @ [158:9] ==> public final val delegateExpression: UExpression? defined in org.jetbrains.uast.kotlin.KotlinUField[PropertyDescriptorImpl]

'accept' @ [158:29] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [158:36] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUField.accept[ValueParameterDescriptorImpl]

'visitor' @ [159:9] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUField.accept[ValueParameterDescriptorImpl]

'afterVisitField' @ [159:17] ==> public open fun afterVisitField(node: UField): Unit defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [159:33] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUField[LazyClassReceiverParameterDescriptor]

'AbstractKotlinUVariable' @ [166:5] ==> public constructor AbstractKotlinUVariable() defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[ClassConstructorDescriptorImpl]

'psi' @ [166:68] ==> value-parameter psi: PsiLocalVariable defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.<init>[ValueParameterDescriptorImpl]

'unwrap' @ [168:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiLocalVariable): PsiLocalVariable defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> ULocalVariable
    <reified P : PsiElement> -> PsiLocalVariable

'psi' @ [168:65] ==> value-parameter psi: PsiLocalVariable defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.<init>[ValueParameterDescriptorImpl]

'super<AbstractKotlinUVariable>' @ [171:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[LazyClassReceiverParameterDescriptor]

'getInitializer' @ [171:47] ==> @Nullable public open fun getInitializer(): PsiExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[JavaMethodDescriptor]

'super<AbstractKotlinUVariable>' @ [175:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [175:47] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedSimpleFunctionDescriptor]

'super' @ [179:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[LazyClassReceiverParameterDescriptor]

'getNameIdentifier' @ [179:22] ==> public open fun getNameIdentifier(): PsiIdentifier defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[SimpleFunctionDescriptorImpl]

'visitor' @ [183:13] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.accept[ValueParameterDescriptorImpl]

'visitLocalVariable' @ [183:21] ==> public open fun visitLocalVariable(node: ULocalVariable): Boolean defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [183:40] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[LazyClassReceiverParameterDescriptor]

'annotations' @ [184:9] ==> public open val annotations: List<UAnnotation> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[PropertyDescriptorImpl]

'acceptList' @ [184:21] ==> public fun List<UElement>.acceptList(visitor: UastVisitor): Unit defined in org.jetbrains.uast.internal[DeserializedSimpleFunctionDescriptor]

'visitor' @ [184:32] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.accept[ValueParameterDescriptorImpl]

'uastInitializer' @ [185:9] ==> public open val uastInitializer: UExpression? defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[PropertyDescriptorImpl]

'accept' @ [185:26] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [185:33] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.accept[ValueParameterDescriptorImpl]

'delegateExpression' @ [186:9] ==> public final val delegateExpression: UExpression? defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[PropertyDescriptorImpl]

'accept' @ [186:29] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [186:36] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.accept[ValueParameterDescriptorImpl]

'visitor' @ [187:9] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinULocalVariable.accept[ValueParameterDescriptorImpl]

'afterVisitLocalVariable' @ [187:17] ==> public open fun afterVisitLocalVariable(node: ULocalVariable): Unit defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [187:41] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[LazyClassReceiverParameterDescriptor]

'KotlinULocalVariable' @ [195:5] ==> public constructor KotlinULocalVariable(psi: PsiLocalVariable, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinULocalVariable[ClassConstructorDescriptorImpl]

'psi' @ [195:26] ==> value-parameter psi: PsiLocalVariable defined in org.jetbrains.uast.kotlin.KotlinUAnnotatedLocalVariable.<init>[ValueParameterDescriptorImpl]

'uastParent' @ [195:31] ==> value-parameter uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUAnnotatedLocalVariable.<init>[ValueParameterDescriptorImpl]

'lz' @ [197:52] ==> internal fun <T> lz(initializer: () -> List<UAnnotation>): Lazy<List<UAnnotation>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UAnnotation>

'invoke' @ [197:57] ==> public abstract operator fun invoke(parent: @ParameterName UElement): List<UAnnotation> defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [197:76] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnnotatedLocalVariable[LazyClassReceiverParameterDescriptor]

'AbstractKotlinUVariable' @ [203:5] ==> public constructor AbstractKotlinUVariable() defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[ClassConstructorDescriptorImpl]

'psi' @ [203:66] ==> value-parameter psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.<init>[ValueParameterDescriptorImpl]

'lz' @ [204:48] ==> internal fun <T> lz(initializer: () -> UClass?): Lazy<UClass?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UClass?

'getLanguagePlugin' @ [204:53] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertOpt' @ [204:73] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UClass? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UClass

'psi' @ [204:92] ==> value-parameter psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.<init>[ValueParameterDescriptorImpl]

'initializingClass' @ [204:96] ==> public final val PsiEnumConstant.initializingClass: PsiEnumConstantInitializer?[MyPropertyDescriptor]

'this' @ [204:115] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'unwrap' @ [206:24] ==> internal inline fun <reified T : UDeclaration, reified P : PsiElement> unwrap(element: PsiEnumConstant): PsiEnumConstant defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : UDeclaration> -> UEnumConstant
    <reified P : PsiElement> -> PsiEnumConstant

'psi' @ [206:63] ==> value-parameter psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.<init>[ValueParameterDescriptorImpl]

'super<AbstractKotlinUVariable>' @ [209:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'getInitializer' @ [209:47] ==> @Nullable public open fun getInitializer(): PsiExpression? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[JavaMethodDescriptor]

'super<AbstractKotlinUVariable>' @ [213:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'getOriginalElement' @ [213:47] ==> public open fun getOriginalElement(): PsiElement? defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[DeserializedSimpleFunctionDescriptor]

'super' @ [217:16] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'getNameIdentifier' @ [217:22] ==> public open fun getNameIdentifier(): PsiIdentifier defined in org.jetbrains.uast.kotlin.AbstractKotlinUVariable[SimpleFunctionDescriptorImpl]

'UastCallKind' @ [221:17] ==> public companion object defined in org.jetbrains.uast.UastCallKind[FakeCallableDescriptorForObject]

'CONSTRUCTOR_CALL' @ [221:30] ==> @field:JvmField public final val CONSTRUCTOR_CALL: UastCallKind defined in org.jetbrains.uast.UastCallKind.Companion[DeserializedPropertyDescriptor]

'KotlinEnumConstantClassReference' @ [229:17] ==> public constructor KotlinEnumConstantClassReference(psi: PsiEnumConstant, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.KotlinEnumConstantClassReference[ClassConstructorDescriptorImpl]

'psi' @ [229:50] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[PropertyDescriptorImpl]

'this' @ [229:55] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'emptyList' @ [233:17] ==> public fun <T> emptyList(): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType

'psi' @ [235:17] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[PropertyDescriptorImpl]

'argumentList' @ [235:21] ==> public final val PsiEnumConstant.argumentList: PsiExpressionList?[MyPropertyDescriptor]

'expressions' @ [235:35] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'size' @ [235:48] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lz' @ [237:36] ==> internal fun <T> lz(initializer: () -> List<UExpression>): Lazy<List<UExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UExpression>

'psi' @ [238:9] ==> value-parameter psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.<init>[ValueParameterDescriptorImpl]

'argumentList' @ [238:13] ==> public final val PsiEnumConstant.argumentList: PsiExpressionList?[MyPropertyDescriptor]

'expressions' @ [238:27] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'map' @ [238:40] ==> public inline fun <T, R> Array<out (PsiExpression..PsiExpression?)>.map(transform: ((PsiExpression..PsiExpression?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)
    <R> -> UExpression

'getLanguagePlugin' @ [239:13] ==> public tailrec fun UElement.getLanguagePlugin(): UastLanguagePlugin defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'convertElement' @ [239:33] ==> public abstract fun convertElement(element: PsiElement, parent: UElement?, requiredType: Class<out UElement>? = ...): UElement? defined in org.jetbrains.uast.UastLanguagePlugin[DeserializedSimpleFunctionDescriptor]

'it' @ [239:48] ==> value-parameter it: (PsiExpression..PsiExpression?) defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.valueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [239:52] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[LazyClassReceiverParameterDescriptor]

'UastEmptyExpression' @ [239:77] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'emptyList' @ [240:14] ==> public fun <T> emptyList(): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'psi' @ [244:17] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[PropertyDescriptorImpl]

'type' @ [244:21] ==> public final val PsiEnumConstant.type: PsiType[MyPropertyDescriptor]

'psi' @ [246:30] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant[PropertyDescriptorImpl]

'resolveMethod' @ [246:34] ==> @Nullable public abstract fun resolveMethod(): PsiMethod? defined in com.intellij.psi.PsiEnumConstant[JavaMethodDescriptor]

'JavaAbstractUExpression' @ [254:9] ==> public constructor JavaAbstractUExpression() defined in org.jetbrains.uast.java.JavaAbstractUExpression[DeserializedClassConstructorDescriptor]

'psi' @ [255:34] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.KotlinEnumConstantClassReference[PropertyDescriptorImpl]

'containingClass' @ [255:38] ==> public final val PsiEnumConstant.containingClass: PsiClass?[MyPropertyDescriptor]

'psi' @ [257:21] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.KotlinEnumConstantClassReference[PropertyDescriptorImpl]

'containingClass' @ [257:25] ==> public final val PsiEnumConstant.containingClass: PsiClass?[MyPropertyDescriptor]

'name' @ [257:42] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'psi' @ [259:21] ==> public open val psi: PsiEnumConstant defined in org.jetbrains.uast.kotlin.KotlinUEnumConstant.KotlinEnumConstantClassReference[PropertyDescriptorImpl]

'containingClass' @ [259:25] ==> public final val PsiEnumConstant.containingClass: PsiClass?[MyPropertyDescriptor]

'name' @ [259:42] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

