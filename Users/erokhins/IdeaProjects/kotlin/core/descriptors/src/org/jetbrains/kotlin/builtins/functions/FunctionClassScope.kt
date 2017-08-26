'GivenFunctionsMemberScope' @ [26:5] ==> public constructor GivenFunctionsMemberScope(storageManager: StorageManager, containingClass: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[ClassConstructorDescriptorImpl]

'storageManager' @ [26:31] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.functions.FunctionClassScope.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [26:47] ==> value-parameter containingClass: FunctionClassDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionClassScope.<init>[ValueParameterDescriptorImpl]

'when ((containingClass as FunctionClassDescriptor).functionKind) {
                FunctionClassDescriptor.Kind.Function -> listOf(FunctionInvokeDescriptor.create(containingClass, isSuspend = false))
                FunctionClassDescriptor.Kind.SuspendFunction -> listOf(FunctionInvokeDescriptor.create(containingClass, isSuspend = true))
                else -> emptyList()
            }' @ [28:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<FunctionDescriptor>, entry1: List<FunctionDescriptor>, entry2: List<FunctionDescriptor>): List<FunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<FunctionDescriptor>

'containingClass' @ [28:20] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionClassScope[PropertyDescriptorImpl]

'functionKind' @ [28:64] ==> public final val functionKind: FunctionClassDescriptor.Kind defined in org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor[PropertyDescriptorImpl]

'Function' @ [29:46] ==> enum entry Function defined in org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor.Kind[FakeCallableDescriptorForObject]

'listOf' @ [29:58] ==> public fun <T> listOf(element: FunctionInvokeDescriptor): List<FunctionInvokeDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionInvokeDescriptor

'FunctionInvokeDescriptor' @ [29:65] ==> public companion object Factory defined in org.jetbrains.kotlin.builtins.functions.FunctionInvokeDescriptor[FakeCallableDescriptorForObject]

'create' @ [29:90] ==> public final fun create(functionClass: FunctionClassDescriptor, isSuspend: Boolean): FunctionInvokeDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionInvokeDescriptor.Factory[SimpleFunctionDescriptorImpl]

'containingClass' @ [29:97] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionClassScope[PropertyDescriptorImpl]

'SuspendFunction' @ [30:46] ==> enum entry SuspendFunction defined in org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor.Kind[FakeCallableDescriptorForObject]

'listOf' @ [30:65] ==> public fun <T> listOf(element: FunctionInvokeDescriptor): List<FunctionInvokeDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionInvokeDescriptor

'FunctionInvokeDescriptor' @ [30:72] ==> public companion object Factory defined in org.jetbrains.kotlin.builtins.functions.FunctionInvokeDescriptor[FakeCallableDescriptorForObject]

'create' @ [30:97] ==> public final fun create(functionClass: FunctionClassDescriptor, isSuspend: Boolean): FunctionInvokeDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionInvokeDescriptor.Factory[SimpleFunctionDescriptorImpl]

'containingClass' @ [30:104] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.functions.FunctionClassScope[PropertyDescriptorImpl]

'emptyList' @ [31:25] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

