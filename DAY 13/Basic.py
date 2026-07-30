
def apply_operation(x, y, operation):
    """Function that takes another function as argument"""
    return operation(x, y)

result = apply_operation(5, 3, +)
print(result)  # 8