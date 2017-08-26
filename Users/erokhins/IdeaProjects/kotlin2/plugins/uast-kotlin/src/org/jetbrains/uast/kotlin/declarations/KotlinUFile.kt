'psi' @ [31:17] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'packageFqName' @ [31:21] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [31:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'psi' @ [34:17] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'annotationEntries' @ [34:21] ==> public final val KtFile.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'map' @ [34:39] ==> public inline fun <T, R> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.map(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> KotlinUAnnotation): List<KotlinUAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R> -> KotlinUAnnotation

'KotlinUAnnotation' @ [34:45] ==> public constructor KotlinUAnnotation(psi: KtAnnotationEntry, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[ClassConstructorDescriptorImpl]

'it' @ [34:63] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.uast.kotlin.KotlinUFile.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [34:67] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFile[LazyClassReceiverParameterDescriptor]

'getValue' @ [36:39] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'ArrayList' @ [37:24] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UComment

'psi' @ [38:9] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'accept' @ [38:13] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'PsiRecursiveElementWalkingVisitor' @ [38:29] ==> protected/*protected and package*/ constructor PsiRecursiveElementWalkingVisitor() defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaClassConstructorDescriptor]

'comments' @ [40:17] ==> val comments: ArrayList<UComment> defined in org.jetbrains.uast.kotlin.KotlinUFile.allCommentsInFile.<anonymous>[LocalVariableDescriptor]

'UComment' @ [40:29] ==> public constructor UComment(psi: PsiComment, uastParent: UElement) defined in org.jetbrains.uast.UComment[DeserializedClassConstructorDescriptor]

'comment' @ [40:38] ==> value-parameter comment: PsiComment defined in org.jetbrains.uast.kotlin.KotlinUFile.allCommentsInFile.<anonymous>.<no name provided>.visitComment[ValueParameterDescriptorImpl]

'this@KotlinUFile' @ [40:47] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFile[LazyClassReceiverParameterDescriptor]

'comments' @ [43:9] ==> val comments: ArrayList<UComment> defined in org.jetbrains.uast.kotlin.KotlinUFile.allCommentsInFile.<anonymous>[LocalVariableDescriptor]

'getValue' @ [46:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [46:34] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'importDirectives' @ [46:38] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'map' @ [46:55] ==> public inline fun <T, R> Iterable<(KtImportDirective..KtImportDirective?)>.map(transform: ((KtImportDirective..KtImportDirective?)) -> KotlinUImportStatement): List<KotlinUImportStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R> -> KotlinUImportStatement

'KotlinUImportStatement' @ [46:61] ==> public constructor KotlinUImportStatement(psi: KtImportDirective, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUImportStatement[ClassConstructorDescriptorImpl]

'it' @ [46:84] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.uast.kotlin.KotlinUFile.imports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [46:88] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFile[LazyClassReceiverParameterDescriptor]

'getValue' @ [48:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'languagePlugin' @ [49:35] ==> public open val languagePlugin: UastLanguagePlugin defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'convert' @ [49:50] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convert(element: PsiElement, parent: UElement?): UClass defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UClass

'this' @ [49:66] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>.toUClass[ReceiverParameterDescriptorImpl]

'this@KotlinUFile' @ [49:72] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFile[LazyClassReceiverParameterDescriptor]

'psi' @ [51:23] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'findFacadeClass' @ [51:27] ==> public fun KtFile.findFacadeClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [51:46] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> MutableList<UClass>): MutableList<UClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> MutableList<UClass>

'mutableListOf' @ [51:52] ==> public fun <T> mutableListOf(vararg elements: UClass): MutableList<UClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UClass

'it' @ [51:66] ==> value-parameter it: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toUClass' @ [51:69] ==> local final fun PsiClass.toUClass(): UClass defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [51:86] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<UClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UClass

'psi' @ [53:29] ==> public open val psi: KtFile defined in org.jetbrains.uast.kotlin.KotlinUFile[PropertyDescriptorImpl]

'declarations' @ [53:33] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [54:14] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>[LocalVariableDescriptor]

'toLightClass' @ [54:48] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [54:64] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Unit

'classes' @ [54:70] ==> val classes: MutableList<UClass> defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>[LocalVariableDescriptor]

'it' @ [54:81] ==> value-parameter it: KtLightClass defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toUClass' @ [54:84] ==> local final fun PsiClass.toUClass(): UClass defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>[SimpleFunctionDescriptorImpl]

'classes' @ [57:19] ==> val classes: MutableList<UClass> defined in org.jetbrains.uast.kotlin.KotlinUFile.classes.<anonymous>[LocalVariableDescriptor]

