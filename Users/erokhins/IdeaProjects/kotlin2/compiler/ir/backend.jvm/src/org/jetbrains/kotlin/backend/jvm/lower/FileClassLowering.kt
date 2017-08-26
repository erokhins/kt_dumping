'ArrayList' @ [30:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrClass

'ArrayList' @ [31:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrDeclaration

'irFile' @ [33:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [33:16] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'forEach' @ [33:29] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'if (it is IrClass)
                classes.add(it)
            else
                fileClassMembers.add(it)' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'it' @ [34:17] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'classes' @ [35:17] ==> val classes: ArrayList<IrClass> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'add' @ [35:25] ==> public open fun add(element: IrClass): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [35:29] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'fileClassMembers' @ [37:17] ==> val fileClassMembers: ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'add' @ [37:34] ==> public open fun add(element: IrDeclaration): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [37:38] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'fileClassMembers' @ [40:13] ==> val fileClassMembers: ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'isEmpty' @ [40:30] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'context' @ [42:35] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering[PropertyDescriptorImpl]

'specialDescriptorsFactory' @ [42:43] ==> public final val specialDescriptorsFactory: SpecialDescriptorsFactory defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'createFileClassDescriptor' @ [42:69] ==> public final fun createFileClassDescriptor(fileEntry: SourceManager.FileEntry, packageFragment: PackageFragmentDescriptor): FileClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.SpecialDescriptorsFactory[SimpleFunctionDescriptorImpl]

'irFile' @ [42:95] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'fileEntry' @ [42:102] ==> public abstract val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'irFile' @ [42:113] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'packageFragmentDescriptor' @ [42:120] ==> public abstract val packageFragmentDescriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'IrClassImpl' @ [43:27] ==> public constructor IrClassImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: ClassDescriptor, members: List<IrDeclaration>) defined in org.jetbrains.kotlin.ir.declarations.impl.IrClassImpl[DeserializedClassConstructorDescriptor]

'irFile' @ [43:42] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'fileEntry' @ [43:49] ==> public abstract val fileEntry: SourceManager.FileEntry defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'maxOffset' @ [43:59] ==> public abstract val maxOffset: Int defined in org.jetbrains.kotlin.ir.SourceManager.FileEntry[DeserializedPropertyDescriptor]

'DEFINED' @ [43:90] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'fileClassDescriptor' @ [43:99] ==> val fileClassDescriptor: FileClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'fileClassMembers' @ [43:120] ==> val fileClassMembers: ArrayList<IrDeclaration> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'classes' @ [44:9] ==> val classes: ArrayList<IrClass> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'add' @ [44:17] ==> public open fun add(element: IrClass): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'irFileClass' @ [44:21] ==> val irFileClass: IrClassImpl defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

'irFile' @ [46:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [46:16] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'clear' @ [46:29] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irFile' @ [47:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[ValueParameterDescriptorImpl]

'declarations' @ [47:16] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedPropertyDescriptor]

'addAll' @ [47:29] ==> public abstract fun addAll(elements: Collection<IrDeclaration>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'classes' @ [47:36] ==> val classes: ArrayList<IrClass> defined in org.jetbrains.kotlin.backend.jvm.lower.FileClassLowering.lower[LocalVariableDescriptor]

